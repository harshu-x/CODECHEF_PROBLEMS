import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		boolean ans[] = new boolean[N+1];
		for(int i=1 ; i<=N;i++){
		    int x =sc.nextInt();
		    ans[x] = true;
		}
		for(int i=1 ; i<ans.length;i++){
		    if(ans[i]==false) System.out.print(i+ " ");
		}

	}
}
