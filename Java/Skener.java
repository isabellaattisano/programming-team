import java.util.Scanner;

public class Skener{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String str;
      
     int R = scan.nextInt();
     int C = scan.nextInt();
     int ZR = scan.nextInt();
     int ZC = scan.nextInt();
     
     String arr;
    
     scan.nextLine();
     
     for(int k = 0; k<R; k++)
     {
         arr="";
         str = scan.nextLine();
          
         for(int i = 0; i<str.length(); i++)
            for(int j = 0; j<ZC; j++)
            arr = arr + str.substring(i,i+1);
       
         for(int p = 0; p<ZR; p++)
            System.out.println(arr);
       
      }

     
   }

}