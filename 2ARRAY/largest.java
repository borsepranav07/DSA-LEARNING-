import java.util.Scanner;                     //Taking keyboard input
import java.util.Arrays;                      //sort(), copyOf(), toString(), binarySearch()


public class largest{

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int arr[]  = new int[10];

        System.out.println("enter elements :");
        for(int i=0;i<10;i++) {
            arr[i] = input.nextInt();
            
        }

        int largest = arr[0];

        for(int i=1;i<10;i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }

        System.out.println("largest element is : " + largest);





        
        Arrays.sort(arr);

        largest = arr[9];

        System.out.println("sorted array is : ");

        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("largest element :" + largest);



    }

}