package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Nacho
 */
public class Categoria {
    String nombre;
    private HashMap<String, Servicio> servicios = new HashMap<String, Servicio>();
    private HashMap<String, Categoria> cathijas = new HashMap<String, Categoria>();
    
    //CONSTRUCTOR
    public Categoria(String Nombre){
        this.nombre = Nombre;
    }
        
    public String getNombre(){
        return this.nombre;
    }
    
    public void AgregarCatHija(Categoria hija){
        cathijas.put(hija.getNombre(), hija);
    }
    
    public ArrayList<String> listarServicios(){
       ArrayList<String> ArrayServicios = new ArrayList<String>();
       for (String name: servicios.keySet()) {
           ArrayServicios.add(servicios.get(name).GetNombre());
       }
       return ArrayServicios;
    }
    
    public DtServicio listarServicios(String nombreServ){
       return servicios.get(nombreServ).getDtServicio();
    }
   
    /*public DtCategoria getDtCategoria(String nombrePadre){
       return new DtCategoria(this.nombre, nombrePadre);
    }*/
    
    public ArrayList<Categoria> getHijos(){
        if (cathijas.size() == 0){
            return null;
        }else{           
            ArrayList<Categoria> ArrayHijos = new ArrayList<Categoria>();
            for (String name: cathijas.keySet()) {
                ArrayHijos.add(cathijas.get(name));
            }
            return ArrayHijos;
        }
    }
    
}

