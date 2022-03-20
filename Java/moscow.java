import java.util.*;

public class moscow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		
        if(a > 0 && b > 0 && c > 0 && a + b + c >= n && n >= 3)
        	System.out.println("YES");
        else
        	System.out.println("NO");


		

	}

}
