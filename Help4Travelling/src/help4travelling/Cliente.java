package help4travelling;

/**
 *
 * @author Bruno
 */
public class Cliente extends Usuario{
    
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
    
    
    //falta lista de reservas
    public DtCliente getDtCliente(){
        return new DtCliente(nick, nombre, apellido, email, fechaN, avatar);
    }
    
}
