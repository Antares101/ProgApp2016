package help4travelling;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtPromocion {
    private String nombre;
    private String nickProv;
    private float descuento;
    private float precio;
    private ArrayList<String> servicios;
        
    public DtPromocion(){}
    
    public DtPromocion(String nombre, String nickProv, float descuento, float precio, ArrayList<String> servicios){
       this.nombre=nombre;
       this.nickProv=nickProv;
       this.descuento=descuento;
       this.precio=precio;
       this.servicios=servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickProv() {
        return nickProv;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getPrecio() {
        return precio;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNickProv(String nickProv) {
        this.nickProv = nickProv;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }
}
