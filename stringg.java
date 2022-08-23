import java.util.*;
public class stringg {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int[] a=new int[n];
          int sum=0;
          for (int i = 0; i < n; i++) {
              a[i]=in.nextInt();
              sum+=a[i];
          }
          ArrayList<Integer> li=new ArrayList<>();
          for (int i = 0; i < n; i++) {
              for (int j = i; j < sum; j++) {
                  if (j<a[i]) {
                      li.add(j);
                  }
              }
          }
    }
}
