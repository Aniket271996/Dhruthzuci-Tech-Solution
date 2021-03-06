import java.util.*;
class MainTwice
{
	static int findSingle(int ar[], int ar_size)
	{
		int res = ar[0];
		for (int i = 1; i < ar_size; i++)
			res = res ^ ar[i];
	
		return res;
	}
	public static void main (String[] args)
	{
		int ar[] = {2,2,1};
		int n = ar.length;
		System.out.println("Element occurring once is = " +findSingle(ar, n) + " ");
	}
}
