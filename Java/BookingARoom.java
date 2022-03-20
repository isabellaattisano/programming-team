import java.util.*;

public class BookingARoom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n = scan.nextInt();
		
		
		if(r == n)
			System.out.println("too late");
		else {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i =0; i<n; i++) {
				list.add(scan.nextInt());
			}
			for(int i=1; i<=r;i++) {
				if(!list.contains(i)) {
					System.out.println(i);
					break;
				}
				
			}
		}

	}

}
