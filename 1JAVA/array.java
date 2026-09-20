import java.util.Scanner;


public class array {

    public static void main(String[] args) {

        int[] marks = {12,32,56,98,10,75};

        System.out.println(marks[0]);
        System.out.println(marks[3]);
        // changing an element
        marks[1] = 23;
        System.out.println(marks[1]);
        System.out.println(marks.length);
        
        // print all elements
        for(int i=0;i<=5;i++) {
            System.err.println(marks[i]);
        }
        for(int value : marks) {
            System.err.println(value);
        }




        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        for(int value : numbers) {
            System.err.println(value);
        }



        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Numbers are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();



        // Finding Sum of Array Elements

        int[] array = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);        


        // Finding Largest Number
        int[] Array = {12,89,3,67,2,65};
        int largest = Array[0];
        for(int i=1; i<Array.length;i++) {
            if(Array[i]>largest) {
                largest = Array[i];
            }
        }
        System.out.println(largest);

        


    }
    
}
