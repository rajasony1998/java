import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int a;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(a+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(a+" is negative number");
        }
        else
        {
            System.out.println(a+" is neither positive nor negative");
        }
    }
}
