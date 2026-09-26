import java.util.LinkedHashSet;
import java.util.Set;

// public class remove_duplicates{
//     public static void main(String[] args) {

//         int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

//         Set<Integer> set = new LinkedHashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         System.out.println(set);
//     }
// }


public class remove_duplicates{

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};


        int n= arr.length;

        int j=0;
        for(int i=1;i<n;i++) {

            if(arr[i] != arr[j]){

                arr[j+1]=arr[i];
                j++;

            }



        }
        

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]); 
        }
    }

}