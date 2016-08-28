package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Antares
 */

import java.util.HashMap;
import java.util.Map;

public class ManejadorArticulo {
    
    private HashMap<String, Articulo> articulos = new HashMap<String, Articulo>();
    private Articulo promo;
    private static ManejadorArticulo instance = null;
    
    
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
    
     public ArrayList<String> listarPromociones(){
        ArrayList<String> ArrayPromociones = new ArrayList<String>();
        for (String name: articulos.keySet()) {
            if (articulos.get(name).isPromocion())
                ArrayPromociones.add(articulos.get(name).GetNombre());
        }
        return ArrayPromociones;
    }
     
    public DtPromocion datosPromociones(String nombreProm){
         promo = articulos.get(nombreProm);
         return promo.getDtPromocion();
    }
    
    public DtServicio datosServicio(String nombreServ){
         return promo.getDatosServProm(nombreServ);
    }
     
}
