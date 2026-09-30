import java.util.*;

public class spiral_matrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24, 25, 26, 27}
        };

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // 1. Left -> Right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // 2. Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // 3. Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4. Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println(ans);
    }
}