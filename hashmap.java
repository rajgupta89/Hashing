import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>li=new HashMap<>();
        li.put("My", 200);
        li.put("Name", 300);
        li.put("is", 400);
        li.put("Raj", 36000);
        System.out.println(li);
        if (li.containsKey("Raj")) {   // to get value by using key
            Integer val=li.get("Raj");
            System.out.println(val);
        }
        
    }
}
