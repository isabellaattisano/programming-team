import java.util.Scanner;

public class towerconstruction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int current = scan.nextInt();
		int next;
		int tower =1;
		
		for(int i =1; i<N; i++) {
			next = scan.nextInt();
			if(next > current) {
				tower++;
			}
			current = next;
		}
		
		System.out.println(tower);
	}

}
