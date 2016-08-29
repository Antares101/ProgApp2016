/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Enzo
 */
public class ManejadorUsuario {
    private static ManejadorUsuario instancia=null;
    private HashMap<String, Usuario> usuarios;
    
     private ManejadorUsuario(){
       usuarios=new HashMap<String, Usuario>();
    }
     
     public static ManejadorUsuario getinstance(){
        if (instancia==null)
            instancia = new ManejadorUsuario();
        return instancia;
    }
     
     public List<String> listarClientes(){
         //Creo la lista a para devolver
         List<String> userCi = new ArrayList<String>();      
         //creo un iterador para recorrer las claves del mapa
         Iterator it = usuarios.keySet().iterator();
         
         while(it.hasNext())
            {
                //pide elemento
                String key = it.next().toString();
                //si es null lo descarta, si es algo lo guarda
                if(null==usuarios.get(key).getNickCliente())
                {
                    //nada
                }else {
                    userCi.add(usuarios.get(key).getNickCliente());
                    //agrega a la lista
                }

                }
         
      return  userCi;
  }
     
     public List<String> listarProveedores(){
         //Creo la lista a para devolver
         List<String> userCi = new ArrayList<String>();      
         //creo un iterador para recorrer las claves del mapa
         Iterator it = usuarios.keySet().iterator();
         
         while(it.hasNext())
            {
                //pide elemento
                String key = it.next().toString();
                //si es null lo descarta, si es algo lo guarda
                if(null==usuarios.get(key).getNickProveedor())
                {
                    //nada
                }else {
                    userCi.add(usuarios.get(key).getNickProveedor());
                    //agrega a la lista
                }

                }
         
      return  userCi;
  }
}
