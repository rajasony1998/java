import java.util.*;
 class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s1 = "";
		int N = x.nextInt();
		String s = ""+N;
		for(int i=s.length()-1;i>=0;i--)
		{
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}

}
