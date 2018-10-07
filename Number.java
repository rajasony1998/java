import java.util.*;
import java.lang.*;
import java.io.*;
class Num
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int a[]=new int[N];
		int sum=0;
		for(int i=0;i<N;i++)
		{
			a[i]=s.nextInt();
	    }
	    for(int i=0;i<K;i++)
	    {
	  
	    		sum+=a[i];
	      
	    }
	    System.out.print(sum);
		
	}
}