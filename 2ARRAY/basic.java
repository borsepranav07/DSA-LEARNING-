// This statement imports the Arrays class from Java's java.util package.
// The Arrays class provides many built-in methods for working with arrays, such as:
// Sorting arrays
// Searching elements
// Printing arrays
// Copying arrays
// Comparing arrays
// Filling arrays
// Without importing it, Java won't recognize methods like Arrays.sort() or Arrays.toString().



import java.util.Arrays;                      //sort(), copyOf(), toString(), binarySearch()
import java.util.Collections;                 //sort(), reverse(), max(), min() for ArrayList
import java.util.Scanner;                     //Taking keyboard input
import java.util.ArrayList;                   //Creating dynamic arrays

public class basic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array object are in heap
        // heap objects are not continous
        




        // ==========================
        // 1. Declaration
        // ==========================
        int[] arr1;

        // ==========================
        // 2. Creation
        // ==========================
        arr1 = new int[5];

        // Default values
        System.out.println("Default Values:");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // ==========================
        // 3. Assign Values
        // ==========================
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println("\nAfter Assigning Values:");

        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Index " + i + " = " + arr1[i]);
        }

        // ==========================
        // 4. Initialization
        // ==========================
        int[] arr2 = {5, 10, 15, 20, 25};

        System.out.println("\nInitialized Array:");

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // ==========================
        // 5. Enhanced For Loop
        // ==========================
        System.out.println("\n\nUsing Enhanced For Loop:");

        for(int value : arr2) {
            System.out.print(value + " ");
        }

        // ==========================
        // 6. Length
        // ==========================
        System.out.println("\n\nLength of Array:");
        System.out.println(arr2.length);

        // ==========================
        // 7. Sum
        // ==========================
        int sum = 0;

        for(int value : arr2) {
            sum += value;
        }

        System.out.println("\nSum = " + sum);

        // ==========================
        // 8. Maximum
        // ==========================
        int max = arr2[0];

        for(int i = 1; i < arr2.length; i++) {
            if(arr2[i] > max) {
                max = arr2[i];
            }
        }

        System.out.println("Maximum = " + max);

        // ==========================
        // 9. Minimum
        // ==========================
        int min = arr2[0];

        for(int i = 1; i < arr2.length; i++) {
            if(arr2[i] < min) {
                min = arr2[i];
            }
        }

        System.out.println("Minimum = " + min);

        // ==========================
        // 10. Reverse Printing
        // ==========================
        System.out.println("\nReverse Array:");

        for(int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        // ==========================
        // 11. Copy Array
        // ==========================
        int[] copy = Arrays.copyOf(arr2, arr2.length);

        System.out.println("\n\nCopied Array:");

        for(int value : copy) {
            System.out.print(value + " ");
        }

        // ==========================
        // 12. Sort Array
        // ==========================
        int[] arr3 = {50, 20, 10, 90, 60};

        Arrays.sort(arr3);

        System.out.println("\n\nSorted Array:");

        for(int value : arr3) {
            System.out.print(value + " ");
        }

        // ==========================
        // 13. Search Element
        // ==========================
        int search = 90;
        boolean found = false;

        for(int value : arr3) {
            if(value == search) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("\n\n90 Found");
        } else {
            System.out.println("\n\n90 Not Found");
        }

        // ==========================
        // 14. String Array
        // ==========================
        String[] names = {"Pranav", "Rahul", "Amit"};

        System.out.println("\nString Array:");

        for(String name : names) {
            System.out.println(name);
        }

        // ==========================
        // 15. Character Array
        // ==========================
        char[] letters = {'A', 'B', 'C', 'D'};

        System.out.println("\nCharacter Array:");

        for(char ch : letters) {
            System.out.print(ch + " ");
        }

        // ==========================
        // 16. 2D Array
        // ==========================
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("\n\n2D Array:");

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ==========================
        // 17. Jagged Array
        // ==========================
        int[][] jagged = {
                {1,2},
                {3,4,5},
                {6}
        };

        System.out.println("\nJagged Array:");

        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // input array :

        int[] Array = new int[5];

        System.out.println("enter values : ");

        //  storing values :
        for(int i=0;i<Array.length;i++) {
            Array[i] = input.nextInt();
        }

        // printing values : 
        for(int i=0;i<Array.length;i++) {
            System.out.println("index " + i + " : " + Array[i]);
        }



        // Take Input in a 2D Array :
        int[][] ARRAY = new int[4][4];
        System.out.println("print 16 elements : ");

        //  taking input :
        for(int row = 0;row<ARRAY.length;row++) {
            for(int col=0;col<ARRAY[row].length;col++) {
                ARRAY[row][col] = input.nextInt();
            }
        }
        
        //  2d array ;
        
        for(int row = 0;row<ARRAY.length;row++) {
            for(int col=0;col<ARRAY[row].length;col++) {
                System.out.print(ARRAY[row][col] + " ");
            }
            System.out.println();
        }

        // What is Arrays.toString()?
        // Arrays.toString() is a static method in the Arrays class that converts an array into a readable String.
        // Without it, Java prints the memory address of the array object instead of its contents.

        for(int row = 0;row<ARRAY.length;row++) {
            System.out.println(Arrays.toString(ARRAY[row]));
            System.out.println();
        }

        for(int[] value : ARRAY) {
            System.out.println(Arrays.toString(value));
        }




        //  ArrayList :
        // An ArrayList is a class in Java that stores a dynamic list of elements. Unlike an array, an ArrayList can grow and shrink automatically


        // Array                        ArrayList
        // Array	                    ArrayList
        // Fixed size	                Dynamic size
        // Can store primitives	        Stores objects (use wrapper classes like Integer)
        // Faster	                    Slightly slower
        // Uses length	                Uses size()
        // No built-in add/remove	    Has add(), remove(), contains(), etc.



        // =====================================
        // 1. Creating an ArrayList
        // =====================================

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Empty List:");
        System.out.println(list);

        // =====================================
        // 2. Adding Elements
        // =====================================

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("\nAfter Adding Elements:");
        System.out.println(list);

        // =====================================
        // 3. Adding Element at Specific Index
        // =====================================

        list.add(2, 100);

        System.out.println("\nAfter Adding 100 at Index 2:");
        System.out.println(list);

        // =====================================
        // 4. Accessing Elements
        // =====================================

        System.out.println("\nElement at Index 0 : " + list.get(0));
        System.out.println("Element at Index 3 : " + list.get(3));

        // =====================================
        // 5. Updating an Element
        // =====================================

        list.set(1, 500);

        System.out.println("\nAfter Updating Index 1:");
        System.out.println(list);

        // =====================================
        // 6. Removing an Element
        // =====================================

        list.remove(2);

        System.out.println("\nAfter Removing Index 2:");
        System.out.println(list);

        // =====================================
        // 7. Size of ArrayList
        // =====================================

        System.out.println("\nSize = " + list.size());

        // =====================================
        // 8. Checking if Element Exists
        // =====================================

        System.out.println("\nContains 40 ? " + list.contains(40));
        System.out.println("Contains 200 ? " + list.contains(200));

        // =====================================
        // 9. Printing Using For Loop
        // =====================================

        System.out.println("\nPrinting Using For Loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // =====================================
        // 10. Printing Using Enhanced For Loop
        // =====================================

        System.out.println("\n\nPrinting Using For-Each Loop:");

        for (int value : list) {
            System.out.print(value + " ");
        }

        // =====================================
        // 11. Sorting
        // =====================================

        Collections.sort(list);

        System.out.println("\n\nAfter Sorting:");
        System.out.println(list);

        // =====================================
        // 12. Reversing
        // =====================================

        Collections.reverse(list);

        System.out.println("\nAfter Reversing:");
        System.out.println(list);

        // =====================================
        // 13. Finding Maximum
        // =====================================

        System.out.println("\nMaximum = " + Collections.max(list));

        // =====================================
        // 14. Finding Minimum
        // =====================================

        System.out.println("Minimum = " + Collections.min(list));

        // =====================================
        // 15. Checking Empty
        // =====================================

        System.out.println("\nIs Empty ? " + list.isEmpty());

        // =====================================
        // 16. Copying ArrayList
        // =====================================

        ArrayList<Integer> Copy = new ArrayList<>(list);

        System.out.println("\nCopied List:");
        System.out.println(Copy);

        // =====================================
        // 17. Clearing ArrayList
        // =====================================

        Copy.clear();

        System.out.println("\nAfter Clearing Copy:");
        System.out.println(Copy);

        // =====================================
        // 18. Original List
        // =====================================

        System.out.println("\nOriginal List:");
        System.out.println(list);



        // defining arraylist :   

        ArrayList<Integer> arraylist = new ArrayList<>();

        
        System.out.println("enter number of elements : ");
        int n = input.nextInt();

        System.out.println("enter " + n + " numbers : ");


        for(int i=0;i<n;i++) {
            arraylist.add(input.nextInt());
        }

        //  printint all elements :
        System.out.println("\narraylist : ");
        System.out.println(arraylist);



        // multidimensional arraylist : 

        ArrayList<ArrayList<Integer>> listed = new ArrayList<>();

        // Create 3 rows
        for (int i = 0; i < 3; i++) {
            listed.add(new ArrayList<>());
        }

        System.out.println("Enter 9 numbers:");

        // Input
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                listed.get(row).add(input.nextInt());

            }
        }

        // Print matrix
        for (ArrayList<Integer> row : listed) {
            System.out.println(row);
        }



        // Swapping :
        int[] a = {1, 3, 555, 4, 5, 6, 7, 56};
        for(int i=a.length-1;i>=0;i--) {
            System.out.println(a[i]);
        }
        swap(a, 1, 3);

        System.out.println(Arrays.toString(a));
        
        // reverse 
        reverse(a);
        
        System.out.println(Arrays.toString(a));

        // printing maximum in an array :
        System.out.println(max(a));
        System.out.println(maxRange(a,3,6));


    }


    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static int max(int[] a) {
        int maxVal = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]>maxVal) {
                maxVal = a[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] a,int start,int end) {
        int maxVal = a[start];
        for(int i=start;i<end;i++) {
            if(a[i]>maxVal) {
                maxVal = a[i];
            }
        }
        return maxVal;
    }


    static void reverse(int[] a) {
        int start = 0;
        int end = a.length-1;
        while(end>start) {
            swap(a, start, end);
            start++;
            end--;

        }

    }

}
