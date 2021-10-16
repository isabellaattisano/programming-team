import java.util.*;

public class BitBit
{
   public static void main(String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   int n = scan.nextInt();
   
   int count=0, i, j;
   
   char[] arr = new char[32];
      
   while(n!=0)
   {
      count =0;
      
      for(int b =0; b<=31; b++)
      {
        arr[b] = '?';
      }
  
      
      while(count<n)
      {
         String str = scan.next();
         
         if(str.equalsIgnoreCase("SET"))
         {
            i = scan.nextInt();
            arr[31-i] = '1';
         }
         
         if(str.equalsIgnoreCase("CLEAR"))
         {
            i = scan.nextInt();
            arr[31-i] = '0';
         }

         if(str.equalsIgnoreCase("OR"))
         {
            i = scan.nextInt();
            j = scan.nextInt();
            
            if(arr[31 - i] == '1' || arr[31 - j] == '1')
               arr[31-i] = '1';
            else if(arr[31 - i] == '0' && arr[31 - j] == '0')
               arr[31-i] = '0';
            else if(arr[31-i] == '?' || arr[31-j] == '?')
               arr[31-i] = '?';
                     
         }

         if(str.equalsIgnoreCase("AND"))
         {
            i = scan.nextInt();
            j = scan.nextInt();
            
            if(arr[31 - i] == '1' && arr[31 - j] == '1')
               arr[31-i] = '1';
            else if(arr[31-i] == '0' || arr[31-j] == '0')
               arr[31-i] = '0'; 
            else if(arr[31-i] == '?' || arr[31-j] == '?')
               arr[31-i] = '?';
                  
         }

                
         count++;
       }
       for(int c =0; c<=31; c++)
       {
      System.out.print(arr[c]);
      }
      System.out.println();
      n = scan.nextInt();
       
       
     
   }
   
      
   }
   
}
