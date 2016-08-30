package help4travelling;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

=======
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
/**
 * @author Antares
 */

import java.util.HashMap;
import java.util.Map;

public class ManejadorArticulo {
    
<<<<<<< HEAD
    private HashMap<String, Articulo> articulos = new HashMap<String, Articulo>();
    private Articulo promo;
    private static ManejadorArticulo instance = null;
    
=======
    private Map articulos;
    private static ManejadorArticulo instance = null;
    
    private ManejadorArticulo(){
        articulos = new HashMap();
    }
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
    
    public static ManejadorArticulo GetInstance(){
        if (instance==null)
            instance = new ManejadorArticulo();
        return instance;
    }
    
    public void AgregarPromocion(Promocion p){
        String key = p.GetNombre();
        this.articulos.put(key, p);
    }
    
    public boolean IsPromocion(String name){
        return articulos.containsKey(name);
    }
<<<<<<< HEAD
    
     public ArrayList<String> listarPromociones(){
        ArrayList<String> ArrayPromociones = new ArrayList<String>();
        for (String name: articulos.keySet()) {
            if (articulos.get(name).isPromocion())
                ArrayPromociones.add(articulos.get(name).GetNombre());
        }
        return ArrayPromociones;
    }
     
    public Set<DtServicio> ListarServicios(){
        Set<DtServicio> ret = new HashSet<DtServicio>();
        for (String key: articulos.keySet()){
            if(articulos.get(key).IsServicio()){
                ret.add(articulos.get(key).GetDtServicio());
            }
        }
        return ret;
    }
     
     
    public DtPromocion datosPromociones(String nombreProm){
         promo = articulos.get(nombreProm);
         return promo.getDtPromocion();
    }
    
    public DtServicio datosServicio(String nombreServ){
         return promo.getDatosServProm(nombreServ);
    }
    
    public Servicio BuscarServicio(String nameServ){
        return (Servicio)articulos.get(nameServ);
    }
     
=======
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
}
