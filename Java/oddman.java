import java.util.*;

public class oddman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		int N = scan.nextInt();
		int G = scan.nextInt();
		for(int i =0; i<N; i++) {
			list.clear();
			for(int j =0; j<G; j++) {
				
				int num = scan.nextInt();
				
				if(list.containsKey(num))
					list.put(num, (list.get(num)+1));
				else
					list.put(num, 1);
			}
			System.out.print("Case #" + (i+1) + ": ");
			for(Integer key : list.keySet()) {
				if(list.get(key) == 1)
					System.out.println(key);
			}
			 G = scan.nextInt();

		}
	}

}
