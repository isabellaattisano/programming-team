import java.util.Scanner;

public class Moose{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int num = scan.nextInt();
      int num2 = scan.nextInt();
      
       if(num == 0 && num2 ==0)
         System.out.println("Not a moose");

      else if(num == num2)
         System.out.println("Even " + num*2);
              
      else
         System.out.println("Odd " + ((num>num2) ? num*2 : num2*2));
            
   }
}