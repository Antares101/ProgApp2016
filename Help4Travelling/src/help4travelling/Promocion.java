package help4travelling;

/**
 * @author Antares
 */
public class Promocion extends Articulo {
    private float descuento;
    private float precioTotal;
    private float precio;
    
    public Promocion(DtPromocion DtProm){
        String name = DtProm.GetNombre();
        this.SetNombre(name);
        this.descuento = DtProm.GetDescuento();
        this.precio = DtProm.GetPrecio();
        this.precioTotal = DtProm.GetPrecio();
    }    
}
