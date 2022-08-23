// program to simply insert values in hashtable and printing values by key using string and remove value by using key
import java.util.*;
public class hashtable1 {
      public static void main(String[] args) {
          Hashtable<Integer, String> li=new Hashtable<Integer, String>();
          li.put(1, "Hello");
          li.put(2, "My");
          li.put(3, "Name");
          li.put(4, "is");
          li.put(5, "Raj");
          System.out.println(li);   // print hashtable value

          String val=li.get(1);      //store key 1 vale in val
          System.out.println(val);   // print value stores in key 1
         

          li.remove(3);    // remove value present in key 3

          Iterator<Integer> itr=li.keySet().iterator();
          while (itr.hasNext()) {
              Integer key=itr.next();
              String mapvalue=li.get(key);
              System.out.println("KEY : "+key+", VALUE : "+mapvalue);
          }
      }    
}