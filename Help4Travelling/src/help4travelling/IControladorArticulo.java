package help4travelling;

import java.util.ArrayList;

/**
 * @author Antares
 */
public interface IControladorArticulo {
    public abstract boolean CrearPromocion(DtPromocion DtProm);
    public abstract ArrayList<String> listarPromociones();
    public abstract DtPromocion datosPromociones(String nombreProm);
    public abstract DtServicio datosServicio(String nombreServ);
}
