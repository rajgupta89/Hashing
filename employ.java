import java.util.*;
class employ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0) {
            String a[]=new String[3];
            for (int i = 0; i < 3; i++) {
                a[i]=in.next();
            }
            System.out.println("Employee's data:");
            System.out.println("GRADE : "+ a[1]);
            System.out.println("SALARY : "+a[2]);
        }
    }
}
