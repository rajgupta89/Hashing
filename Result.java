import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
class Result {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        double left=0;
        double right=Math.pow(2, n);
        double center=0;
        HashMap<Integer,Double> li=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)=='L') {
                right=(left+right)/2;
                center=right;
                li.put(i+1,center);
            }
            else{
                left=(left+right)/2;
                center=left;
                li.put(i+1,center);
            }
        }
        Map<Integer,Double> sorted = li
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
        for(Map.Entry<Integer,Double> ent : sorted.entrySet()){
            
            System.out.println(ent.getKey());
        }
    }
}
