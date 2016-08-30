
package help4travelling;

public class DtFecha {
    private int dia, mes, anio;
    
    public DtFecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1950;
    }

    public DtFecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public DtFecha(DtFecha f) {
        this.dia = f.getDia();
        this.mes = f.getMes();
        this.anio = f.getAnio();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "DtFecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
}
