import java.util.*;
import java.util.Scanner;

public class Recount{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  
        
        String in = "", name = "name";
        int max = 0,runoff=0, count=0;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        
        while(!(in.equals("***"))) {
        
            in = scan.nextLine();
            
            if(map.containsKey(in))
            {
                map.put(in, map.get(in)+1);
                
            }
            else {
                map.put(in, 1);
                list.add(in);
                
            }
        
        }
        
        for(int i =0; i<list.size(); i++) {
            if(map.get(list.get(i)) > max) {
                max = map.get(list.get(i));
                name = list.get(i);
            }
            else if(map.get(list.get(i)) == max){
                count++;
            }
        }
        if(count > 0) {
            System.out.println("runoff!");
        }
        else
            System.out.println(name);
        
    }

}