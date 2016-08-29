
package help4travelling;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Usuario implements Serializable {
    
     @Id protected String nick;
     protected String nombre; 
     protected String apellido;
     protected String email; 
     protected DtFecha fechaN; 
     protected Blob[] avatar; 
     
     public abstract String getNickCliente();
     public abstract String getNickProveedor();
     
    
}
