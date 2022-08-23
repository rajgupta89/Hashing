import java.util.*;
import java.util.Map.Entry;
public class repeat_last {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.MAX_VALUE;
        int[] a=new int[100];
        n=in.nextInt();
        HashMap<Integer,Integer> li=new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int count=0;
        for (int i = n-1; i <= 0; i--) {
            if(li.containsKey(a[i]) && a[i]>0){
                 System.out.println(a[i]);
                 break;
            }
                else{
                    if (a[i]>0) {
                        li.put(a[i],1);  
                    }
                }
        }
    }
}
