package help4travelling;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.ArrayList;
=======
import java.util.ArrayList;

>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
/**
 *
 * @author Nacho
 */
public class Categoria {
<<<<<<< HEAD
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
=======

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<String> listarServicios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
    }
    
}

