import java.util.*;

public class stats {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = 0;
		while(scan.hasNextLine()) {
			cases++;
			
			String line = scan.nextLine();
			
			List<String> list = Arrays.asList(line.split(" "));

			int max = Integer.parseInt(list.get(1));
			int min = Integer.parseInt(list.get(1));
			
			for(int i =2; i<list.size(); i++) {
				int x = Integer.parseInt(list.get(i));
				if(x > max)
					max = x;
				else if(x<min)
					min = x; 
			}
			System.out.println("Case " + cases + ": " + min + " " + max + " " + (max-min) );
		}
		

	}

}
