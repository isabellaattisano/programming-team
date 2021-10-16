import java.util.*;

public class Cold{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int input = scan.nextInt();
        int count =0;
        
        for(int i = input; i>0; i--)
        {
            int temp = scan.nextInt();
            
            if(temp<0)
                count++;
        }
        
        System.out.println(count);
    }
}