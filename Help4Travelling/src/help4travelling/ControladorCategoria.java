package help4travelling;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ControladorCategoria implements IControladorCategoria{
    
    public ArrayList<String> listarCategorias(){
        return ManejadorCategoria.GetInstance().listarCategorias();
    }
    
    public ArrayList<String> listarServicios(String nombre){
        return ManejadorCategoria.GetInstance().listarServicios(nombre);
    }
}
