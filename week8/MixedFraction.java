import java.util.*;

public class MixedFraction
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int num = scan.nextInt();
         int den = scan.nextInt();
            
        while(num != 0 && den !=0)
        {
            
            System.out.print(num/den + " ");
            System.out.print(num%den + " / ");
            System.out.println(den);

            num = scan.nextInt();
            den = scan.nextInt();
        }
        
            
    }
}
