import java.util.*;

public class paradox {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		
		for(int i = 0; i<T; i++) {
			scan.nextLine();
			ArrayList<Integer> cs = new ArrayList<>();
			ArrayList<Integer> e = new ArrayList<>();
			int CS = scan.nextInt(), E = scan.nextInt(), sumCS = 0, sumE = 0;
			
			for(int j = 0; j<CS; j++) {
				int x = scan.nextInt();
				cs.add(x);
				sumCS+=x;
			}
			
			for(int j = 0; j<E; j++) {
				int x = scan.nextInt();
				e.add(x);
				sumE+=x;
			}
			
			Collections.sort(cs);
			
			
			
			double avgcs = (double)sumCS / cs.size();
			double avge= (double)sumE / e.size();
			int count =0;
			
			for(int j = 0; j<CS; j++) {
		
				
				if(cs.get(j) < avgcs && cs.get(j) > avge) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		
	}
}
