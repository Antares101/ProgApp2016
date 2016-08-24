package help4travelling;

/**
 * @author Antares
 */

import java.util.HashMap;
import java.util.Map;

public class ManejadorArticulo {
    
    private Map articulos;
    private static ManejadorArticulo instance = null;
    
    private ManejadorArticulo(){
        articulos = new HashMap();
    }
    
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
}
