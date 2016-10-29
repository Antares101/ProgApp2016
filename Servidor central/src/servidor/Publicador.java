package servidor;

import help4travelling.*;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class Publicador {
    
    //private Logica logica = new Logica();
    private static IControladorCategoria ICCategoria = Factory.GetInstance().getIControladorCategoria();
    private static IControladorArticulo ICArticulo = Factory.GetInstance().getIControladorArticulo();
    private static IControladorReserva ICReserva = Factory.GetInstance().getIControladorReserva();
    private static IControladorUsuario ICUsuario = Factory.GetInstance().getIControladorUsuario();
    private Endpoint endpoint = null;

    //Constructor
    public Publicador(){}


    @WebMethod(exclude = true)
    public void publicar(){
        //System.out.println("init");
        ManejadorSQL.GetInstance().init("192.168.10.132");
        //System.out.println(ICUsuario.chequearNick("eWatson"));
        endpoint = Endpoint.publish("http://localhost:9130/publicadorWeb", this);
    }
    
    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
            return endpoint;
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    //Articulos
    
    @WebMethod
    public DtPromocion[] listarPromociones(){
        //return ICArticulo.listarPromociones();
        ArrayList<DtPromocion> prom = ICArticulo.listarPromociones();             
        DtPromocion[] ret = prom.toArray(new DtPromocion[prom.size()]);
        return ret;
    }   
    
    @WebMethod
    public DtPromocion datosPromocion(String nombreProm, String nameProv){
        return ICArticulo.datosPromociones(nombreProm, nameProv);
    }
    
    @WebMethod
    public boolean EsServicio(String nombreServicio){
        //Toma por sentado que el nombre es de un servicio, recorre todos las promociones del sistema, si el nombre es igual a una de ellas devuelve false
        ArrayList<DtPromocion> lart = ICArticulo.listarPromociones();
        boolean ret = true;
        for(DtPromocion x : lart){
            if(x.getNombre().equalsIgnoreCase(nombreServicio)) ret = false;
        }
        return ret;
    }
    
    @WebMethod
    public DtServicio[] serviciosXprov(String nickP){
        //return ICArticulo.ListarServiciosProv(nickP);
        ArrayList<DtServicio> servXprom = ICArticulo.ListarServiciosProv(nickP);             
        DtServicio[] ret = servXprom.toArray(new DtServicio[servXprom.size()]);
        return ret;
    }
    
    @WebMethod
    public DtCategoria[] listarCategorias(){
        //return ICCategoria.listarCategorias();
        ArrayList<DtCategoria> cat = ICCategoria.listarCategorias();             
        DtCategoria[] ret = cat.toArray(new DtCategoria[cat.size()]);
        return ret;
    }
    
    @WebMethod
    public DtServicio[] listarServicios(){
        //return ICArticulo.ListarServicios();
        ArrayList<DtServicio> serv = ICArticulo.ListarServicios();             
        DtServicio[] ret = serv.toArray(new DtServicio[serv.size()]);
        return ret;
    }
    
    @WebMethod
    public DtServicio[] serviciosXcat(String nameCat){
        //return ICCategoria.listarServicios(nameCat);
        ArrayList<DtServicio> servXcat = ICCategoria.listarServicios(nameCat);             
        DtServicio[] ret = servXcat.toArray(new DtServicio[servXcat.size()]);
        return ret;
    }
    
    @WebMethod
    public DtServicio ObtenerDatosServicio(String nameServ, String nameProv){
        return ICArticulo.datosServicio(nameServ, nameProv);
    }
    
    @WebMethod
    public byte[] getImagenArt(String nickP, String nomA, String num){
        return ManejadorSQL.GetInstance().selectImgServicio(num, nickP, nomA);
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    //Reservas
    
    @WebMethod
    public Integer[] listarReservas(String nickname){
        //return ICReserva.listarReservasXcli(nickname);
        ArrayList<Integer> res = ICReserva.listarReservasXcli(nickname);             
        Integer[] ret = res.toArray(new Integer[res.size()]);
        return ret;
    }
    
    @WebMethod
    public DtReserva devolverReserva(int id){
        return ICReserva.datosReservas(id);
    }
    
    @WebMethod
    public void agregarReserva(int id, Estado estado, DtFecha date, ArrayList<DtInfoReserva> infoReserva ,String nickCli, float precio){
        ICReserva.CrearReserva(new DtReserva(id, estado, date, infoReserva ,nickCli, precio));
    }
    
    @WebMethod
    public Integer[] ObtenerReservas(String cli){
        ArrayList<Integer> res = ICReserva.listarReservasXcli(cli);             
        Integer[] Iret = res.toArray(new Integer[res.size()]);
        return Iret;
    }
    
    @WebMethod
    public DtInfoReserva[] ObtenerDatosReserva(int idRes){
        //return ICReserva.ObtenerInfoArticulosReservados(idRes);
        ArrayList<DtInfoReserva> datRes = ICReserva.ObtenerInfoArticulosReservados(idRes);             
        DtInfoReserva[] ret = datRes.toArray(new DtInfoReserva[datRes.size()]);
        return ret;
    }
    
    @WebMethod  
    public boolean agregarRes(Estado E, DtFecha fecha, ArrayList<DtInfoReserva> DtInf,String nick,float F){
        return ICReserva.CrearReserva(new DtReserva(E, fecha, DtInf, nick, F));
    }
    
    @WebMethod
    public boolean cancelarReserva(int id){
        return ICReserva.actualizarEstado(Estado.Cancelada, id);
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    //Usuarios
    
    @WebMethod
    public DtCliente verPerfil(String nickname){
        return ICUsuario.datosCliente(nickname);
    }
    
    @WebMethod
    public boolean autenticarCliente(String nick, String email){
        return ICUsuario.VerificarUsuario(email, email);
    }
    
    @WebMethod
    public String[] listarProveedores(){
        //return (ArrayList)ICUsuario.listarProveedores();
        ArrayList<String> listProv = (ArrayList)ICUsuario.listarProveedores();             
        String[] ret = listProv.toArray(new String[listProv.size()]);
        return ret;
    } 
    
    @WebMethod
    public void agregarCliente(DtCliente dtcli){
        ICUsuario.AltaCliente(dtcli);
    }
    
    @WebMethod
    public boolean VerificarNickCliente(String nick){
        return ICUsuario.chequearNick(nick);
    }
    
    @WebMethod
    public boolean VerificarEmailCliente(String email){
        return ICUsuario.chequearEmail(email);
    }

    @WebMethod
    public DtProveedor[] listarProveedoresDatos(){
        ArrayList<DtProveedor> ret = new ArrayList<DtProveedor>();
        ArrayList<String> provs = (ArrayList)ICUsuario.listarProveedores();
        for(int x = 0; x < provs.size(); x++){
            ret.add(ICUsuario.datosProveedor(provs.get(x).trim()));
        }             
        DtProveedor[] ret2 = ret.toArray(new DtProveedor[ret.size()]);
        return ret2;
    }
    
    @WebMethod
    public byte[] getImagenUsu(String nickP){
        return ManejadorSQL.GetInstance().selectImgUsuario(nickP);
    }
    
    @WebMethod
    public DtCliente devolverCliente(String nick){
        return ICUsuario.datosCliente(nick);
    }
    
}
