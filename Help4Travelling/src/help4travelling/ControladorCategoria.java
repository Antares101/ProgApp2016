package help4travelling;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ControladorCategoria implements IControladorCategoria{
    
<<<<<<< HEAD
    public ArrayList<DtCategoria> listarCategorias(){
=======
    public ArrayList<String> listarCategorias(){
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
        return ManejadorCategoria.GetInstance().listarCategorias();
    }
    
    public ArrayList<String> listarServicios(String nombre){
        return ManejadorCategoria.GetInstance().listarServicios(nombre);
    }
<<<<<<< HEAD
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorCategoria.GetInstance().datosServicio(nombreServ);
    }
=======
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
}
