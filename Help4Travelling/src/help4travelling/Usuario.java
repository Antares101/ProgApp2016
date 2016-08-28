
package help4travelling;

import java.sql.Blob;

/**
 *
 * @author Bruno
 */
public abstract class Usuario {
    
     protected String nick;
     protected String nombre; 
     protected String apellido;
     protected String email; 
     protected DtFecha fechaN; 
     protected Blob[] avatar; 
     
     public abstract String getNickCliente();
     public abstract String getNickProveedor();
     
    
}
