package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ManejadorCategoria {
    
    private HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
    private Categoria categ;
    private static ManejadorCategoria instance = null;
    
    public static ManejadorCategoria GetInstance(){
        if (instance==null)
            instance = new ManejadorCategoria();
        return instance;
    }
    
    /*public ArrayList<String> listarCategorias(){
        ArrayList<String> ArrayCategorias = new ArrayList<String>();
        for (String name: categorias.keySet()) {
            ArrayCategorias.add(categorias.get(name).getNombre());
        }
        return ArrayCategorias;
    }*/
    
     public ArrayList<DtCategoria> listarCategorias(){
        return listarCategoriasAux("todo");        
    }
     
    public ArrayList<DtCategoria> listarCategoriasAux(String padre){
        if (categorias.get(padre).getHijos() != null){
           ArrayList<DtCategoria> ArrayCategorias = new ArrayList<DtCategoria>();
           ArrayList<Categoria> ArrayHijos = categorias.get(padre).getHijos();
           for (int i = 0; i < ArrayHijos.size(); i++) {
               ArrayCategorias.add(new DtCategoria(ArrayHijos.get(i).getNombre(),padre));
               ArrayList<DtCategoria> hijo = listarCategoriasAux(ArrayHijos.get(i).getNombre());
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
    }
    
}
