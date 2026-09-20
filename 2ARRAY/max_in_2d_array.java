public class max_in_2d_array {
    public static void main(String[] args) {

        int[][] arr = {
            {23, 46, 1},
            {18, 22, 9, 10},
            {12, 34, 87, 23},
            {19, 30}
        };

        System.out.println(max(arr));
    }

    // static int max(int[][] arr) {

    //     int max = arr[0][0];

    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if (arr[row][col] > max) {
    //                 max = arr[row][col];
    //             }
    //         }
    //     }

    //     return max;
    // }



        static int max(int[][] arr) {

        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }
}