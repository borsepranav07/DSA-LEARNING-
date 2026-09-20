import java.util.Scanner;                     //Taking keyboard input


public class min_in_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[8];
        
        
        System.out.println("enter the element of array : ");
        for(int i=0;i<8;i++) {
            array[i] = input.nextInt();
        }


        System.out.println("the minimum element is : " + min_element(array));
        
    }

    static int min_element(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        

        return min;
    }
}
