import java.util.*;
public class PalindromicSum {

    public static void getSplNumber(int[] arrip) {
        int count=0;
        for (int i = 0; i < arrip.length; i++) {
            int tempSum = 0;
            //to iterate from 1 to number/2
            for (int j = 1; j <= arrip[i] / 2; j++) {
                //to get the reverse of the number
                int revNum = getRevNum(j);
                tempSum = revNum + j;
                if (tempSum == arrip[i]) {
                    // System.out.println(arrip[i]);
                    count++;
                    break;
                } 
            }
        }
        System.out.println(count);
    }

    public static int getRevNum(int num) {
        int rev = 0;
        //to get reverse of a number
        while(num!=0) {
            int reminder = num%10;
            rev = rev*10 + reminder;
            num = num/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr = new int[n];
        int n=in.nextInt();
        getSplNumber(arr);

    }

}