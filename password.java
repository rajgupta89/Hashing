import java.util.*;
import java.util.Map.Entry;

public class password {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        HashMap<Integer,Integer> li=new HashMap<>();
        while (a>0) {
            int rem_a=a%10;
            a/=10;
            if(li.containsKey(rem_a))
            li.put(rem_a, li.get(rem_a)+1);
            else
            li.put(rem_a,1);
            int rem_b=b%10;
            b/=10;
            if(li.containsKey(rem_b))
            li.put(rem_b, li.get(rem_b)+1);
            else
            li.put(rem_b,1);
            int rem_c=c%10;
            c/=10;
            if(li.containsKey(rem_c))
            li.put(rem_c, li.get(rem_c)+1);
            else
            li.put(rem_c,1);
        }
        int maxx=0;
        int minn=Integer.MAX_VALUE;
        int maxx1=0;
        int minn1=Integer.MAX_VALUE;
        for(Entry<Integer,Integer> ent : li.entrySet()){ 
            maxx=Math.max(ent.getKey(), maxx);
           minn=Math.min(ent.getKey(),minn);
            maxx1=Math.max(ent.getValue(), maxx1);
           minn1=Math.min(ent.getValue(),minn1);
     }
     int max_ele=0;
     int min_ele=Integer.MAX_VALUE;
     for(Entry<Integer,Integer> ent:li.entrySet()){
         if (ent.getValue()==maxx1) {
             max_ele=Math.max(ent.getKey(), max_ele);
         }
         if (ent.getValue()==minn1) {
             min_ele=Math.min(ent.getKey(), min_ele);
         }
     }
     System.out.print(maxx+""+minn+""+max_ele+""+min_ele);
    }
}
