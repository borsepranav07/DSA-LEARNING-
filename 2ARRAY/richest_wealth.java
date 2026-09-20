public class richest_wealth {

    public static void main(String[] args) {
        
        int[][] arr = {
            {12,45,89,35},
            {45,87,10,43},
            {16,49,31,56},
            {43,67,87,80}
        };

        int max = arr[0][0];
        for(int i=0;i<arr.length;i++) {
            int rowsum = 0;
            for(int j=0;j<arr[i].length;j++) {
                rowsum += arr[i][j];
            }
            if(rowsum > max) {
                max = rowsum;
            }
        }

        System.out.println(max);

    }
    
}
