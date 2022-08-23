/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int[] a=new int[n];
		    for (int i=0;i<n ;i++ ){
		       a[i]=in.nextInt();
            }
		    Map<Integer,Integer> li=new HashMap<>();
		    for (int i = 0; i < n; i++)
		{
			if (li.containsKey(a[i]))
			{
				li.put(a[i], li.get(a[i]) + 1);
			}
			else
			{
				li.put(a[i], 1);
			}
		}
        int maxx=0;
        int count=0;
        for(Entry<Integer,Integer> ent : li.entrySet()){  
            maxx=Math.max(maxx, ent.getValue());
     }
        for(Entry<Integer,Integer> ent : li.entrySet()){  
            if (ent.getValue()==maxx) {
                count++;
            }
     }
        if(count==1)
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
		}
	}
}
