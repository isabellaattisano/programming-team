import java.util.Scanner;

public class GoatRope {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if(y1<= y && y <=y2) {
		    if(x1> x)
		    	System.out.println(x1-x);
		    else
		    	System.out.println(x-x2);
		}
		
		else if(x1<= x && x <=x2) {
		    if(y1> y)
		        System.out.println(y1-y);
		    else 
		    	System.out.println(y-y2);
		}
		
		 else {
			int tx = 0;
		    int ty = 0;
		    if(Math.abs(x-x1) < Math.abs(x-x2))
		        tx = x1;
		    else
		        tx = x2;
		    if(Math.abs(y - y1) < Math.abs(y - y2))
		        ty = y1;
		    else
		        ty = y2;
		    System.out.println(Math.pow(( Math.pow((x-tx),2) + Math.pow((y-ty),2)),0.5));
		 }
	}

}
