/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Nacho
 */
public class DtCategoria {
    String Nombre;
    private HashSet<Categoria> cathijas;        
    //private HashSet<Servicios> servasociados;
    
    public DtCategoria(String nombre){
        this.Nombre=nombre;
    }
    
    public DtCategoria(String nombre, HashSet<Categoria> hijas){
        this.Nombre=nombre;
        cathijas = new HashSet<Categoria>();
        Iterator it = hijas.iterator();
        while(it.hasNext()){
            cathijas.add(it.Next());
        }
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public HashSet<Categoria> getCategoriasHijas(){
        return this.cathijas;
    }
}
