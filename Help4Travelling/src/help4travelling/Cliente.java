package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;


/**
 *
 * @author Bruno
 */
public class Cliente extends Usuario{
    
    private HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();
    
    public Cliente (DtCliente u){
        this.nick= u.getNick();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar();        
    }
    
    
    @Override
    public String getNickCliente(){
        return this.nick;
    }
    
    @Override
    public String getNickProveedor(){
        return "";
    }
    
 
    public DtCliente getDtCliente(){
        ArrayList<Reserva> ArrayReservas = new ArrayList<Reserva>();
        for (String name: reservas.keySet()) {
            ArrayReservas.add(reservas.get(name));
        }
        return new DtCliente(nick, nombre, apellido, email, fechaN, avatar, ArrayReservas);
    }
    
}
