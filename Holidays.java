import java.util.Scanner;
 class Holidays {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		if(a.equalsIgnoreCase("sunday")||a.equalsIgnoreCase("saturday"))
		{
        System.out.println("yes");
		}
		else 
		{
			System.out.println(" no");
		}


	}

}