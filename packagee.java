import java.util.*;
import java.util.Map.Entry;
class packagee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        HashMap<Integer, Integer> li=new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            if(li.containsKey(a[i]))
               li.put(a[i], li.get(a[i])+1);
            else
               li.put(a[i], 1);
        }
        int count=0;
        for(Entry<Integer,Integer> ent : li.entrySet()){
            if(ent.getValue()%2==0 || ent.getValue()%3==0)
               count++;
            else{
               count=-1;
               break;
            }
        }
        System.out.println(count);
    }
}
