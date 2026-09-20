import java.util.Arrays;
import java.util.Scanner;

public class search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 46, 1},
            {18, 22, 9, 10}, 
            {12, 34, 87, 23},
            {19, 30}
        };

        int target = 87;

        // int[] ans = search(arr, target);

        // System.out.println(Arrays.toString(ans));
        System.out.println(search(arr, target));
    }

    static int search(int[][] arr, int target) {
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==target) {
                    // return  arr[row][col];
                    return  target; 
                    // return new int[]{row,col};
                }
            }
        }
        return -1;
        // return new int[]{-1,-1};

    }
    
}
