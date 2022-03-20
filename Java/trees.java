import java.util.Arrays;
import java.util.Scanner;

public class trees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int trees = scan.nextInt();
		int[] days = new int[trees];

		for (int i = 0; i < days.length; i++)
			days[i] = scan.nextInt();

		Arrays.sort(days);
		int early = 0;
		int temp =0;
		
		for (int i = days.length - 1; i >= 0; i--){
			days[i] +=  1 + (days.length - i);
			
			if (days[i] > early)
				early = days[i];
			}

		System.out.println(early);

	}
}
		

