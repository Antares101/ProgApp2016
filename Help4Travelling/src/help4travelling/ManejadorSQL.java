package help4travelling;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorSQL {
    
    public static EntityManagerFactory emf;
    public static EntityManager em;

<<<<<<< HEAD
    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static EntityManager getEm() {
=======
    public ManejadorSQL() {
        init();
    }
    
    public static void init(){
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
        if(em == null){
            ManejadorSQL.emf = Persistence.createEntityManagerFactory("Help4Traveling");
            ManejadorSQL.em = ManejadorSQL.emf.createEntityManager();
        }
<<<<<<< HEAD
=======
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static EntityManager getEm() {
>>>>>>> 73f5a92178f8b3fcfa205a495a509eb919a0f27b
        return em;
    }

    public static void setEmf(EntityManagerFactory emf) {
        ManejadorSQL.emf = emf;
    }

    public static void setEm(EntityManager em) {
        ManejadorSQL.em = em;
    }
}