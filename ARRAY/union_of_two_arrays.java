import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class union_of_two_arrays {

    public static void main(String[] args) {

        // int[] arr1 = {1, 2, 3, 4};
        // int[] arr2 = {3, 4, 5, 6};

        // Set<Integer> set = new HashSet<>();

        // for (int num : arr1) {
        //     set.add(num);
        // }

        // for (int num : arr2) {
        //     set.add(num);
        // }

        // System.out.println(set);





        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6};

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            // Take smaller element
            if (arr1[i] < arr2[j]) {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr1[i]) {

                    union.add(arr1[i]);
                }

                i++;

            } else if (arr2[j] < arr1[i]) {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr2[j]) {

                    union.add(arr2[j]);
                }

                j++;

            } else {

                // Both are equal
                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr1[i]) {

                    union.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr1[i]) {

                union.add(arr1[i]);
            }

            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr2[j]) {

                union.add(arr2[j]);
            }

            j++;
        }

        System.out.println(union);
    }
    
}
