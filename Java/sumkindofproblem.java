import java.util.Scanner;

public class sumkindofproblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int sum1 =0, sum2 =0, sum3 =0;
		
		for(int i = 1; i<=p; i++) {
			sum1 =0; sum2 =0; sum3 =0;
			int K = scan.nextInt();
			int N = scan.nextInt();
			for(int j = 0; j<=N; j++) {
				sum1+=j;
				sum2+=2*j+1;
				sum3+=2*j;
			}
			System.out.println(i + " " + sum1 + " " + (sum2-(2*N)-1) + " " + sum3);
		}

	}

}
