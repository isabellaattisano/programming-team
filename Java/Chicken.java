import java.util.*;

public class Chicken {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int guests = scan.nextInt(), total = scan.nextInt();
        
        if(guests < total) {
            if(total - guests == 1)
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            else
                System.out.println("Dr. Chaz will have " + (total-guests)+ " pieces of chicken left over!");
        
        }
        else {
            if(guests - total == 1)
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            else
                System.out.println("Dr. Chaz needs " + (guests - total) +  " more pieces of chicken!");

        }
    }

}
