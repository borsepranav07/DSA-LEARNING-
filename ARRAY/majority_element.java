import java.util.HashMap;

public class majority_element {

    public static void main(String[] args) {
        
        int[] arr = {1,2,1,3,2,1,4,3,3,3,3,3,3};

        int n = arr.length;


        //    BRUTE FORCE :

        // for(int i=0;i<n;i++) {
        //     int cnt =0;

        //     for(int j=0;j<n;j++) {
        //         if(arr[j] == arr[i]) {
        //             cnt++;
        //         }
        //     }

        //     if(cnt > n/2) {
        //         System.out.println(cnt); 
        //         System.out.println(arr[i]);
        //     }
        // }



        //  OPTIMAL SOLUTION :

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                System.out.println(num); 
            }
        }



        // int[] hash = new int[13];

        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]]++;
        //     if(hash[arr[i]] >n/2) {
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }


        

        





    }
    
}
