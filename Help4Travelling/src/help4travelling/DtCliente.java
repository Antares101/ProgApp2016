package help4travelling;

import java.sql.Blob;
import java.util.ArrayList;

<<<<<<< HEAD
=======
/**
 *
 * @author agustin
 */
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
public class DtCliente {

    DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Reserva> ArrayReservas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    DtFecha getFechaN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Blob[] getAvatar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private DtFecha fechaN;
    private Blob[] avatar;
    private ArrayList<Reserva> reserva;
    
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Reserva> reserva){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.avatar=avatar;
        this.reserva=reserva;
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.avatar=avatar;
    }

    DtCliente(String text, String text0, String text1, String text2, DtFecha dtFecha, Blob b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNick(){
        return this.nick;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public DtFecha getFechaN(){
        return this.fechaN;
    }
    
    public Blob[] getAvatar(){
        return this.avatar;
    }
    
}
