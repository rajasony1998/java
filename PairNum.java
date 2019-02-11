import java.util.*;
 class PairNum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=0;
		for(int i=n-1;i>=0;i--)
		{
			k=k+i;
		}
		System.out.print(k);
	}
}