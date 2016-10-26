package help4travelling;

import java.util.HashMap;

public class ManejadorRegistro {
    private HashMap<String, DtRegistro> registros = new HashMap<String, DtRegistro>();
    private DtRegistro registro;
    private static ManejadorRegistro instance = null;
    
    public static ManejadorRegistro GetInstance(){
        if (instance==null){
            instance = new ManejadorRegistro();
            ManejadorSQL.GetInstance().cargarCategorias();
        }
        return instance;
    }
}
