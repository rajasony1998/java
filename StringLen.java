import java.util.*;
 class StringLen
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        String s="";
        if(s1.length()<s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(ch1[i]==ch2[i])
                {
                    s+=ch1[i]+"";
                }
                else
                    break;
            }
        }
        else
        {
            for(int i=0;i<s2.length();i++)
            {
                if(ch1[i]==ch2[i])
                {
                    s+=ch2[i]+"";
                }
                else
                    break;
            }
        }
        System.out.print(s);
        
    }
}