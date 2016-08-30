package help4travelling;

<<<<<<< HEAD
import help4travelling.DtCliente;
import help4travelling.DtProveedor;
import help4travelling.ManejadorUsuario;
import java.util.List;

=======
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
/**
 *
 * @author Bruno
 */
public class ControladorUsuario implements IControladorUsuario{
<<<<<<< HEAD

    public void ingresarUsuario( DtCliente cliente){

     }

    public void ingresarUsuario( DtProveedor proveedor){

     }

    public List<String> listarClientes(){
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.listarClientes();
    }

    public List<String> listarProveedores(){
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.listarProveedores();
    }

=======
    
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
}
