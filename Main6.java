import java.util.Scanner;
 class Main
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);
       yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("yes");
       }
       else if((yr%100 == 0) && (yr%400 == 0))
       {
           System.out.print("yes");
       }
       else if(yr%400 == 0)
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("No");
       }
    }
}