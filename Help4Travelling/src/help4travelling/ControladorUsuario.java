package help4travelling;

import help4travelling.DtCliente;
import help4travelling.DtProveedor;
import help4travelling.ManejadorUsuario;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class ControladorUsuario implements IControladorUsuario{

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

}
