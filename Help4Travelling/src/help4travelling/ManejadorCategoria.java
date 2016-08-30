package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ManejadorCategoria {
    
    private HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
<<<<<<< HEAD
    private Categoria categ;
=======
    
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
    private static ManejadorCategoria instance = null;
    
    public static ManejadorCategoria GetInstance(){
        if (instance==null)
            instance = new ManejadorCategoria();
        return instance;
    }
    
<<<<<<< HEAD
    /*public ArrayList<String> listarCategorias(){
=======
    public ArrayList<String> listarCategorias(){
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
        ArrayList<String> ArrayCategorias = new ArrayList<String>();
        for (String name: categorias.keySet()) {
            ArrayCategorias.add(categorias.get(name).getNombre());
        }
        return ArrayCategorias;
<<<<<<< HEAD
    }*/
    
     public ArrayList<DtCategoria> listarCategorias(){
        return listarCategoriasAux("todo", 0);        
    }
     
    public ArrayList<DtCategoria> listarCategoriasAux(String padre, int nivel){
        if (categorias.get(padre).getHijos() != null){
           ArrayList<DtCategoria> ArrayCategorias = new ArrayList<DtCategoria>();
           ArrayList<Categoria> ArrayHijos = categorias.get(padre).getHijos();
           for (int i = 0; i < ArrayHijos.size(); i++) {
               ArrayCategorias.add(new DtCategoria(ArrayHijos.get(i).getNombre(),padre,nivel));
               ArrayList<DtCategoria> hijo = listarCategoriasAux(ArrayHijos.get(i).getNombre(), nivel+1);
               if (hijo.get(0) != null){
                   for (int j = 0; j < hijo.size(); j++) {
                       ArrayCategorias.add(hijo.get(j));
                   }
               }
           }        
           return ArrayCategorias;
        }else{
            return null;
        }
       
    }
    
     public ArrayList<String> listarServicios(String nombre){
         categ = categorias.get(nombre);
         return categ.listarServicios();
    }
     
     public DtServicio datosServicio(String nombreServ){
         return categ.listarServicios(nombreServ);
=======
    }
    
     public ArrayList<String> listarServicios(String nombre){
         return categorias.get(nombre).listarServicios();
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
    }
    
}
