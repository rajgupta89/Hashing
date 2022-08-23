import java.util.*;
 
class solution
{
static int removeColon(String s)
{
    if (s.length() == 4)
        s = s.substring(0,1) + s.substring(2);
     
    if (s.length() == 5)
        s = s.substring(0,2) + s.substring(3);
     
    return Integer.valueOf(s);
}
 
static String diff(String s1, String s2)
{
 
    int time1 = removeColon(s1);
    int time2 = removeColon(s2);
 
    int hourDiff = time2 / 100 - time1 / 100 - 1;
 
    int minDiff = time2 % 100 + (60 - time1 % 100);
 
    if (minDiff >= 60) {
        hourDiff++;
        minDiff = minDiff - 60;
    }
 
int minutes=(hourDiff*60)+minDiff;
// String res=String.valueOf(minutes);
    String res = String.valueOf(hourDiff) + ':' + String.valueOf(hourDiff+minDiff);
    return res;
}
   
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    String s1 = "09:30";
    String s2 = in.nextLine();
    System.out.println(diff(s1, s2));
}
}