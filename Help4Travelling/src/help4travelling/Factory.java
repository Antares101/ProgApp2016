package help5travel;

/**
 *
 * @author Antares
 */
public class Factory {
    
   private static Factory instance; //Singleton
   private Factory(){}  //Creator
   
   public static Factory GetInstance(){
       if (instance == null){
           instance = new Factory();
       }
       return instance;
   }
   
   //public IControladorUsuario getIControladorUsuario(){}

 }
