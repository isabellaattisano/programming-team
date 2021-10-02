import java.util.*;

public class QALY{
   public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);

   double count =0;   
   int periods = scan.nextInt();
   
      for(int i =0; i<periods; i++)
          count = count + (scan.nextDouble()*scan.nextDouble());
 
      
      System.out.println(count);
   
 
   }
}