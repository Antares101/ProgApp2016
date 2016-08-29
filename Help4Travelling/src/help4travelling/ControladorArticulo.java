package help4travelling;

import java.util.ArrayList;
import java.util.Set;

/**
 * @author Antares
 */

public class ControladorArticulo implements IControladorArticulo{    
    private Promocion prom;
    
    public ControladorArticulo(){}
    
    public boolean CrearPromocion(DtPromocion DtProm){
        String nameProm = DtProm.GetNombre();
        ManejadorArticulo manArt = ManejadorArticulo.GetInstance();
        boolean ok = manArt.IsPromocion(nameProm);
        
        //Si la instancia no existe ya en el sistema puedo crearla
        if(ok == false){
            Promocion p = new Promocion(DtProm);
            manArt.AgregarPromocion(p);
            this.prom = p;
        }        
        
        return !ok;
    }
    
    public ArrayList<String> listarPromociones(){
        return ManejadorArticulo.GetInstance().listarPromociones();
    }
    
    public Set<DtServicio> ListarServicios()
    {
        return ManejadorArticulo.GetInstance().ListarServicios();
    }
    
    public void PublicarServicio(String nameServ){
        Servicio ser = ManejadorArticulo.GetInstance().BuscarServicio(nameServ);
        this.prom.AgregarServicio(ser);
        this.prom = null;
    }
    
    
    public DtPromocion datosPromociones(String nombreProm){
        return ManejadorArticulo.GetInstance().datosPromociones(nombreProm);
    }
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorArticulo.GetInstance().datosServicio(nombreServ);
    }
}
