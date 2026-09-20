public class sorted_array_1752 {

    public static void main(String[] args) {

        int count = 0;

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) {

                count++;

            }
        }

        if(count <=1) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }




    }
}
