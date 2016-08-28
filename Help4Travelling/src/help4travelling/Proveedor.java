package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Proveedor extends Usuario{
    
    private String nombreEmpresa;
    private String url;
    private HashMap<String, Servicio> servicios = new HashMap<String, Servicio>();
    
    public Proveedor (DtProveedor u){
        this.nick= u.getNick();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar(); 
        this.nombreEmpresa= u.getNombreEmpresa();
        this.url= u.getUrl();
    }
    
    
    @Override
    public String getNickCliente(){
        return "";
    }
    
    @Override
    public String getNickProveedor(){
        return this.nick;
    }
    
    
    public DtProveedor getDtProveedor(){
        ArrayList<Servicio> ArrayServicios = new ArrayList<Servicio>();
        for (String name: servicios.keySet()) {
            ArrayServicios.add(servicios.get(name));
        }
        return new DtProveedor(nick, nombre, apellido, email, fechaN, avatar, nombreEmpresa, url, ArrayServicios);
    }
}
