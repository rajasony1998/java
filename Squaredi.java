import java.util.Scanner;
public class Squaredi
{
    
    static void square(int num)
    {
    	int sum_square=0;int temp;
    	while(num>0)
    	{
    		int r=num%10;
    		temp=r*r;
    		sum_square+=temp;
    		num=num/10;
    	}
    	System.out.println(sum_square);

    }
    public static void main (String[] args) 
    {
    	Scanner sn = new Scanner(System.in);
    	int n = sn.nextInt();
    	square(n);

    }
}