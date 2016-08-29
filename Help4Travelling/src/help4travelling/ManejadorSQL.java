package help4travelling;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorSQL {
    
    public static EntityManagerFactory emf;
    public static EntityManager em;

    public ManejadorSQL() {
        init();
    }
    
    public static void init(){
        if(em == null){
            ManejadorSQL.emf = Persistence.createEntityManagerFactory("Help4Traveling");
            ManejadorSQL.em = ManejadorSQL.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEmf(EntityManagerFactory emf) {
        ManejadorSQL.emf = emf;
    }

    public static void setEm(EntityManager em) {
        ManejadorSQL.em = em;
    }
}