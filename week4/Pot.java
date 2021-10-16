import java.util.*;
import java.lang.*;

public class Pot{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
    
      int n = scan.nextInt();
      int sum=0;
      
      for(int i=0; i<n; i++)
      {
      
      String str = scan.next();
      Integer num = Integer.parseInt(str.substring(0, str.length()-1));
      Integer pow = Integer.parseInt(str.substring(str.length()-1, str.length()));
      
      sum = sum + (int)Math.pow(num, pow);      
      
      
      }
    
      System.out.println(sum);
       
   }
}

 