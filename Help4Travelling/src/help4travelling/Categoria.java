package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Categoria {
  
      private String nombre;
      
      private HashMap<String, Servicio> servicios = new HashMap<String, Servicio>();
      
      public String getNombre(){
        return this.nombre;
      }
      
      public ArrayList<String> listarServicios(){
        ArrayList<String> ArrayServicios = new ArrayList<String>();
        for (String name: servicios.keySet()) {
            ArrayServicios.add(servicios.get(name).GetNombre());
        }
        return ArrayServicios;
      }
    
}
