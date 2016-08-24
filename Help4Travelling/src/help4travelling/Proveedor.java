package help4travelling;

/**
 *
 * @author Bruno
 */
public class Proveedor extends Usuario{
    
    private String nombreEmpresa;
    private String url;
    
    public Proveedor (DtProveedor u){
        this.nick= u.getNick();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar(); 
        this.nombreEmpresa= u.getNombreEmpresa();
        this.url= u.getUrl();
    }
    
    
    @Override
    public String getNickCliente(){
        return "";
    }
    
    @Override
    public String getNickProveedor(){
        return this.nick;
    }
    
    //falta lista de servicios
    public DtProveedor getDtProveedor(){
        return new DtProveedor(nick, nombre, apellido, email, fechaN, avatar, nombreEmpresa, url);
    }
}
