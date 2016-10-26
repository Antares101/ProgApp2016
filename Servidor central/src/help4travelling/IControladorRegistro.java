
package help4travelling;

import java.util.ArrayList;

public abstract interface IControladorRegistro{
    public abstract boolean agregarRegistro(DtRegistro reg);
    public ArrayList<DtRegistro> listarRegistros();
}
