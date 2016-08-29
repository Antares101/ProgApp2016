package help4travelling;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public interface IControladorCategoria {
     public abstract ArrayList<String> listarCategorias();
     public abstract ArrayList<String> listarServicios(String nombre);
}
