import java.util.*;
public class hashset {
     public static void main(String[] args) {
         HashSet<String> li=new HashSet<>();
         li.add("My");
         li.add("Name");
         li.add("is");
         li.add("Raj");
         li.add("Name");    // hashset is used to remove duplicate values
         System.out.println(li);

         Iterator<String> itr=li.iterator();
         while (itr.hasNext()) {
             System.out.println(itr.next());
         } 
     }    
}
