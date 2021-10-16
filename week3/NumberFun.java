import java.util.*;

public class NumberFun{
   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   int N;
   double a,b,c;
   
   N = scan.nextInt();
   
   for(int i =0; i<N; i++)
   {
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      
      if(a + b == c || a-b ==c || a*b==c || b-a == c || a/b==c || b/a ==c)
         System.out.println("Possible");
      else
         System.out.println("Impossible");
   }
   
   
   
   
   }
}