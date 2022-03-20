import java.util.Scanner;

public class LeftBehind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int count = 1;
		
		while(count<15) {
			if(x+y == 13)
				System.out.println("Never speak again.");
			else if(x>y)
				System.out.println("To the convention.");
			else if(x==y) 
				System.out.println("Undecided.");
			else
				System.out.println("Left beehind.");
			 x = scan.nextInt();
			 y = scan.nextInt();
			 if(x == 0 && y ==0)
				 break;
			 count++;
		}
		
		

	}

}
