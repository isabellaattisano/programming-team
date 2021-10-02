import java.util.Scanner;

public class QALY{
   public static void main(String[] args){
   
   double count =0.0;
   double x = 0, y = 0;
   
   Scanner scan = new Scanner(System.in);
   
   int periods = scan.nextInt();
   
      for(int i =0; i<periods; i++)
      {
         x = scan.nextDouble();
         y = scan.nextDouble();
         count = count + (x*y);
      }
      
      System.out.println(count);
   
 
   }
}