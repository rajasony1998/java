import java.util.Scanner;
class Main{

  public static void main(String[] args) {
    int a, b, c,d;
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      b = s.nextInt();
      c = s.nextInt();
      d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
       System.out.println(" " + d);
  }
}