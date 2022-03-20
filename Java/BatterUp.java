import java.util.Scanner;

public class BatterUp{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
     
      int n= scan.nextInt();
      
      int count=0, count2 = 0;
      double sum =0;
   
      while(count<n)
      {
      
      int i = scan.nextInt();
      
      
      if(i>=0)
      {
      sum = sum +i;
      count2++;
           }
      
      count++;
      
      }
      
      System.out.println((double)sum/count2);
   
   }


}