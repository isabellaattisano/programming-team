
import java.util.*;

public class reseto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), K = scan.nextInt(), j=0, val=0;
		int[] arr = new int[N+1];
		for(int i = 2; i<=N; i++) 
			arr[i] = i;
		for(int p=2; p<=N; p++)
		{
			if(arr[p]!=0) {
				j=p;
				while(j<=N && K!=0) {
					val =j;
					if(arr[j]!=0) {
						arr[j] = 0;
						K--;
					}
					j = j+p;
				}
			}
				
				
		}
		System.out.println(val);

	}

}
