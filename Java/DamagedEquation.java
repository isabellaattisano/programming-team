import java.util.*;

public class DamagedEquation {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
						
		int count =0, num1 = -1, num2 =-1;
		
		String ans1 = "", ans2 = "";
		
		for(int i =0; i<4; i++) {
			ans1 = "";
			num1 =-1;
			if(i == 0) {
				num1 = a * b;
				ans1 += a + " * " + b;
			}
			else if(i == 1) {
				num1 = a + b;
				ans1 += a + " + " + b;

			}
			
			else if(i == 2) {
				num1 = a - b;
				ans1 += a + " - " + b;

			}
			
			else if(b!= 0 && i == 3) {
				num1 = a / b;
				ans1 += a + " / " + b;

			}
			
			for(int j =0; j<4; j++) {
				ans2 = "";
				num2 = -1;
				
				if(j == 0) {
					num2 = c * d;
					ans2 += " = " + c + " * " + d;

				}
				else if(j == 1) {
					num2 = c + d;
					ans2 += " = " + c + " + " + d;

				}
				
				else if(j == 2) {
					num2 = c - d;
					ans2 += " = " + c + " - " + d;

				}
				
				else if(j == 3) {
					if(d!=0) {
						num2 = c / d;
						ans2 += " = " + c + " / " + d;
					}
					else
						num2 = num1+5;

				}
			
				if(num1 == num2) {
					System.out.println(ans1 + ans2);
					count++;
				}
			}
		
		}
		
		if(count == 0) {
			System.out.println("problems ahead");
		}
		
		
		
		
	}
	
}
