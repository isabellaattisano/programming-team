import java.util.HashSet;
import java.util.Scanner;

public class Keywords {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N;
        String str;
        N= scan.nextInt();
        scan.nextLine();
        HashSet<String> set = new HashSet<String>();
        
        for(int i =0; i<N; i++) {
            str = scan.nextLine().toLowerCase();
            str = str.replaceAll("-", " ");
            set.add(str);
        }
        
        
        System.out.println(set.size());
        

    }

}