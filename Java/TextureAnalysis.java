import java.util.ArrayList;
import java.util.Scanner;

public class TextureAnalysis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		ArrayList<String> black;
		ArrayList<String> white;
		int count =1;
		boolean noteven = false;
		
		while(!str.equals("END")) {
			black = new ArrayList();
			white = new ArrayList();
			noteven = false;

			
			for(int i = 0; i<str.length(); i++) {
				
				String blackstr ="", whitestr="";
							
				if(str.charAt(i) == '*') {
					if(i+1<str.length() && str.charAt(i+1)=='*') {
						if(str.contains("."))
							noteven = true;
					
					}
					
				}
			
				else {
					while(i<str.length() && str.charAt(i) == '.') {
						whitestr+='.';
						i++;
					}
					i--;
					if(white.size() == 0)
						white.add(whitestr);
					else
					{
						if(!white.get(0).equals(whitestr)) {
							noteven = true;
							break;
						}
						else
							white.add(whitestr);
					}
					
				}		

			
				
			}
			if(noteven || str.length() ==0)
				System.out.println(count + " NOT EVEN");
			else
				System.out.println(count + " EVEN");

			str = scan.nextLine();
			count++;
			
		}
		
		
		
	}

}
