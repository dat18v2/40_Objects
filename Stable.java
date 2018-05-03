import java.util.ArrayList;

public class Stable {

   private ArrayList<Horse> horses = new ArrayList<>();
   
   public void addOne(String name){  
   // Nyt object eller ny hest
      horses.add(new Horse(name));
   }
   
   public void read(){
   
         for(int i = 0;i < horses.size(); i++){            
              Horse tempHest = horses.get(i);
              System.out.println(tempHest.getName());
         }

   }

}