public class RaceTrack {
         
   private Horse horse = new Horse("Klavs den frie");
   private Stable stable = new Stable();
   
   
   public RaceTrack(){
         
         run();
         addOne();
         read();
   }
   
         
   public void run(){
      
      horse.run();
   }
     
   public void addOne(){
      stable.addOne("Mia");
      stable.addOne("Klavs");
      stable.addOne("Mikkel");
   }
         
   public void read (){
         
      stable.read();
         
   }
      

      
     
}