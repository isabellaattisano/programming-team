import java.util.Scanner;

public class OwlFox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i =0; i<T; i++) {
			int N = scan.nextInt();
			int sum1 = 0; 
			int n = N;
			while(n>0) {
				sum1+=n%10;
				n=n/10;
			}
			int k =1;
			if(sum1%2==0)
				k =0;
				
			for(int j=N-1; j>=0;j=2*j+k) {
				int sum2 =0;
				int val =j;
				while(val>0) {
					sum2+=val%10;
					val=val/10;
				}
		


				
				if(sum2==sum1-1) {
					System.out.println(j);
					break;
				}
					
			}
			
			
		}
		
		

	}

}
