package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ManejadorCategoria {
    
    private HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
    
    private static ManejadorCategoria instance = null;
    
    public static ManejadorCategoria GetInstance(){
        if (instance==null)
            instance = new ManejadorCategoria();
        return instance;
    }
    
    public ArrayList<String> listarCategorias(){
        ArrayList<String> ArrayCategorias = new ArrayList<String>();
        for (String name: categorias.keySet()) {
            ArrayCategorias.add(categorias.get(name).getNombre());
        }
        return ArrayCategorias;
    }
    
     public ArrayList<String> listarServicios(String nombre){
         return categorias.get(nombre).listarServicios();
    }
    
}
