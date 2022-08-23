import java.util.*;
import java.util.Map.Entry;

public class frequency
{

	static void countFreq(int arr[], int n)
	{
		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}
		// Traverse through map and print frequencies
		Iterator<Integer> itr=mp.keySet().iterator();
        int maxx=0;
        while (itr.hasNext()) {
            Integer key=itr.next();
            Integer value=mp.get(key);
            maxx=Math.max(maxx, value);
            System.out.println(key + "  "+ value);
		}


		for(Entry<Integer,Integer> ent : mp.entrySet()){   // to find key from value
               if (ent.getValue()==maxx) {
				   System.out.println(ent.getKey());
			   }
		}
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		countFreq(arr, n);
	}
}

// This code contributed by Rajput-Ji
