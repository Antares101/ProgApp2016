package help4travelling;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ControladorCategoria implements IControladorCategoria{
    
    public ArrayList<DtCategoria> listarCategorias(){
        return ManejadorCategoria.GetInstance().listarCategorias();
    }
    
    public ArrayList<String> listarServicios(String nombre){
        return ManejadorCategoria.GetInstance().listarServicios(nombre);
    }
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorCategoria.GetInstance().datosServicio(nombreServ);
    }
}
