/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Nacho
 */
public class Categoria {
    String Nombre;
    private HashSet<Categoria> cathijas;
    DtCategoria DtCat;
    private HashMap<String, Servicio> servicios = new HashMap<String, Servicio>();
    
    //CONSTRUCTOR
    public Categoria(String Nombre){
        this.Nombre = Nombre;
        cathijas = new HashSet<Categoria>();
    }
    
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    
    public void AgregarCatHija(Categoria hija){
        cathijas.add(hija);
    }
    
    public DtCategoria GetDtCategoria(){
        return this.DtCat;
    }
    
    public ArrayList<String> listarServicios(){
       ArrayList<String> ArrayServicios = new ArrayList<String>();
       for (String name: servicios.keySet()) {
           ArrayServicios.add(servicios.get(name).GetNombre());
       }
       return ArrayServicios;
    }

    
    
}

