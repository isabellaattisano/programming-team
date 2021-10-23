import java.util.*;

public class Cake
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      int h = scan.nextInt();
      int v = scan.nextInt();
      
      int multiply =4;
      
      if(h > n-h)
        multiply = multiply * h;
      else          
         multiply = multiply * (n-h);
     
      if(v > n-v)
          multiply = multiply * v;
      else 
          multiply = multiply * (n-v);
      
      System.out.println(multiply);

   }

}