package help4travelling;

public class DtRegistro {
    public String id, ip, url, so, navegador;

    public DtRegistro(String id, String ip, String url, String so, String navegador) {
        this.id = id;
        this.ip = ip;
        this.url = url;
        this.so = so;
        this.navegador = navegador;
    }

    public String getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getUrl() {
        return url;
    }

    public String getSo() {
        return so;
    }

    public String getNavegador() {
        return navegador;
    }
    
    
    
}
