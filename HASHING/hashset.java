import java.util.*;

public class hashset {

    public static void main(String[] args) {
        

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);


        set.contains(3);

        if(set.contains(4)) {
            System.out.println("set contains");
        }else {
            System.out.println("set not contains ");
        }
        if(set.contains(2)) {
            System.out.println("set contains");
        }else {
            System.out.println("set not contains ");
        }
        
        
        
        // remove  
        set.remove(1);
        if(set.contains(1)) {
            System.out.println("set contains");
        }else {
            System.out.println("set not contains ");
        }


        System.out.println(set);





        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }






    }
    
}
