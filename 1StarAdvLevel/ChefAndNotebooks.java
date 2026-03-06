import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndNotebooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0){
		    long X = sc.nextLong();
		    long Y =sc.nextLong();
		    long K =sc.nextLong();
		    int N =sc.nextInt();
		    long prices[] = new long[N];
		    long cost[] = new long[N];
		    for(int i=0;i<N;i++){
		        prices[i]=sc.nextLong();
		        cost[i] = sc.nextLong();
		    }
		    
		    long minPage=X-Y;
		    boolean ans=false;
		    for(int i=0;i<N;i++){
		        if(minPage<=prices[i] && cost[i]<=K){
		            ans=true;
		            break;
		        }
		    }
		    
		    if(ans) System.out.println("LuckyChef");
		    else System.out.println("UnluckyChef");
		    
		    
		    
		}

	}
}
