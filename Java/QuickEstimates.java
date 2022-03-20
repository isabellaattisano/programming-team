import java.util.Scanner; 
 
public class QuickEstimates {

public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int count =Integer.parseInt(scan.nextLine());
    
    for(int i=0;i<count;i++){
        String num =scan.nextLine();
        System.out.println(num.length());
    }

    }
}