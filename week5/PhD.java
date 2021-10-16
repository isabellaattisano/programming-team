import java.util.Scanner;

public class PhD{
    public static void main(String[] args)
    {
    
      Scanner scan = new Scanner(System.in);
      
      int input, count=0; 
      String str;
      Integer sum;
      
      input = scan.nextInt();
      
      scan.nextLine();
      
      while(count<input)      
      {
         str = scan.nextLine();
         
         if(str.equals("P=NP"))
            System.out.println("skipped");
         else
         {
            String[] arr = str.split("\\+");
            Integer num = Integer.parseInt(arr[0]);
            Integer num2 = Integer.parseInt(arr[1]);
         
            sum = num + num2;
         
            System.out.println(sum);
         }
         
         count++;
         
      }      
     
      
      
    
    }
    
}