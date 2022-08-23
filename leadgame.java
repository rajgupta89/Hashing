import java.util.*;
import java.util.Map.Entry;
public class leadgame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int maxx=0;
        HashMap<Integer,Integer> li=new HashMap<>();
        while (t-->0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int diff=0;
            if (a>b) {
                diff=a-b;
                li.put(diff, 1);
            } else {
                diff=b-a;
                li.put(diff, 2);
            }
            maxx=Math.max(diff, maxx);
        }
        // System.out.println(li);
        // System.out.println(maxx);
        for(Entry<Integer,Integer> ent : li.entrySet()){
            if (ent.getKey()==maxx) {
                System.out.println(ent.getValue()+" "+ent.getKey());
            }
        }
    }
}
