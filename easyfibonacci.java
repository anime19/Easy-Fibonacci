/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
	int[] dp = new int[10000000];
		    dp[0] = 0;
		    dp[1] = 1;
		    for(int j=2;j<10000000;j++){
		        dp[j] = (dp[j-1]+dp[j-2])%10;
		    }
		for(int i=0;i<t;i++){
		    int n;
		    n = sc.nextInt();
		    
		    int index=1;
		    while(index<=n){
		        index = index<<1;
		    }
		    index = index>>1;
		    System.out.println(dp[index-1]);
		}
		
	}
}
