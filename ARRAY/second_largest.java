public class second_largest {

    public static void main(String[] args) {


        int arr[] = {10,23,45,78,123,34,56,89,23,546};

        int largest = arr[0];
        int second_largest = -1;

        for(int i=0;i<arr.length-1;i++) {

            if(arr[i]>largest) {
                largest = arr[i];
                second_largest = largest;



            }
            else if(arr[i]>second_largest && arr[i]!=largest) {
                second_largest = arr[i];
            }

        }

        System.out.println("Second largest element is: " + second_largest);
    }
    
}
