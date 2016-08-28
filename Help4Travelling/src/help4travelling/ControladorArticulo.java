package help4travelling;

import java.util.ArrayList;

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
        }
        
        return !ok;
    }
    
    public ArrayList<String> listarPromociones(){
        return ManejadorArticulo.GetInstance().listarPromociones();
    }
    
    public DtPromocion datosPromociones(String nombreProm){
        return ManejadorArticulo.GetInstance().datosPromociones(nombreProm);
    }
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorArticulo.GetInstance().datosServicio(nombreServ);
    }
}
