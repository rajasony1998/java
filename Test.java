import java.util.*;
class Guvi
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        StringBuffer sb = new StringBuffer(20); 
        String stl = sb.append(s).append(" ").toString(); 
        System.out.println(stl); 
    }
}