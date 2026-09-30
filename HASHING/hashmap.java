import java.util.*;

public class hashmap {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        //  insertion
        map.put("india", 120);
        map.put("US" , 30);
        map.put("China", 150);

        System.out.println(map);




        map.put("China" , 18000);
        System.out.println(map);
        


        // search :

        if(map.containsKey("indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in map");
        }

        if(map.containsKey("China")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in map");
        }


        System.out.println(map.get("China"));  //key exists
        System.out.println(map.get("indonesia"));  //key exists



        //  iteration in hashmap:

        int[] arr = {1,2,3,4,5,6,7,8,9};

        for(int val : arr) {
            System.out.println(val);
        }
        
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        //  2nd method :

        Set<String> keys = map.keySet();

        for(String key : keys) {
            System.out.println(key +  " : " + map.get(key));
        }



        
         
    }
    
}
