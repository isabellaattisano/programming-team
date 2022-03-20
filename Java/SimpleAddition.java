import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger A, B;
		
		A  = new BigInteger(scan.nextLine());
		B  = new BigInteger(scan.nextLine());
				
		BigInteger C = A.add(B); 
		
		System.out.println(C);

	}

}
