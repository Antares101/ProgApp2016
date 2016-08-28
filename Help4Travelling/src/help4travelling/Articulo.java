package help4travelling;

/*
 * @author Antares
 */

import java.sql.Blob;

public abstract class Articulo {
    
    protected String nombre;    
    //private Ciudad[] city;  //Si el articulo necesita conocer la ciudad
    //private Provedor prov;    // "
    //private InfoReserva info; //Luego de crearse InfoReserva decomentar
    
    protected String GetNombre(){
        return this.nombre;
    }
    
    protected void SetNombre(String name){
        this.nombre = name;
    }
    
    protected abstract boolean isPromocion();
    
    public abstract DtPromocion getDtPromocion();
    
    public abstract DtServicio getDatosServProm(String nombreServ);
}
