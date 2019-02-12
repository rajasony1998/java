import java.util.*;
import java.lang.*;
import java.util.ArrayList;
 class Cyclic {
     public static void main(String args[]){
     Scanner in=new Scanner(System.in);
      int n=in.nextInt(), k=in.nextInt(),c;
     ArrayList<Integer> a=new ArrayList<Integer>();
     for(int i=0;i<n;i++){
         c=in.nextInt();
        a.add(c);
     }
     Collections.rotate(a,k );
     for(int d:a){
         System.out.printf("%d ", d);
     } }}