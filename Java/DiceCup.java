import java.util.*;

public class DiceCup{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int N = scan.nextInt();
      
      int M = scan.nextInt();
      
      int length = Math.abs(N-M)+1;
       
      int t=0;
      
       if(N>M)
          t = M;
       else if(M>N)
         t = N;
       else if(M==N)
         t = M;

      for(int i = 0; i<length; i++)
         System.out.println(t+(i+1));
   
   }

}