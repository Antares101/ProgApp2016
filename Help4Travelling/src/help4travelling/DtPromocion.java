package help4travelling;

import java.util.ArrayList;

/**
 * @author Antares
 */

public class DtPromocion {
<<<<<<< HEAD
    private String nombre;
    private float descuento;
    private float precioTotal;
    private ArrayList<String> servicios;
        
    
     public DtPromocion(String nombre, float descuento, float precioTotal, ArrayList<String> servicios){
        this.nombre=nombre;
        this.descuento=descuento;
        this.precioTotal=precioTotal;
        this.servicios=servicios;
     }
    
    public String GetNombre() {
        return this.nombre;
    }
    
    public float GetDescuento() {
        return this.descuento;
    }     
=======

    String GetNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
    
     public float GetPrecioTotal() {
        return this.precioTotal;
    }    
}
