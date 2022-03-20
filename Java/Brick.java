import java.util.*;

public class Brick
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		int height = scan.nextInt();
		int width = scan.nextInt();
		
		int count = width;
		
		int n = scan.nextInt();
		
		int[] bricks = new int[n];
		
		for(int i = 0; i<bricks.length; i++)
		{
		    bricks[i] = scan.nextInt();
		}
		
		for(int i =0; i<bricks.length; i++)
		{
		    count = count - bricks[i];
		    
		    if(count == 0)
		    {
		        count = width;
		        height--;
		            if(height ==0)
		                System.out.println("YES");
		    }
		    else if(count<0)
          {
		        System.out.println("NO");
              return;
          }
		}
	    	
	}
}
