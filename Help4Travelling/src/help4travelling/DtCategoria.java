/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Nacho
 */
public class DtCategoria {
    private String nombre;
    private String nombrePadre;
    
    public DtCategoria(String nombre,String nombrePadre){
       this.nombre=nombre;
       this.nombrePadre=nombrePadre;       
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getNombrePadre(){
        return this.nombrePadre;
    }
}
