import java.util.Scanner;
 class Main12
{
  public static void main(String args[])
  { 
    int num;
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("even");
     else if(num<0)
     System.out.println("invalid");
     else
        System.out.println("odd");
  }
}
