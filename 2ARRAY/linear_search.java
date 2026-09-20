
import java.util.Scanner;                     //Taking keyboard input



public class linear_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // linear search in array :
        int[] array = new int[8];
        
        
        System.out.println("enter the element of array : ");
        for(int i=0;i<7;i++) {
            array[i] = input.nextInt();
        }
        System.out.println("enter the target to search : ");
        int target = input.nextInt();
        linearsearch(array, target);
        
        // linear search in string :
        String name = "kunal";
        char Target = 'p';
        System.out.println(search(name, Target ));
        System.out.println(search1(name, Target ));
        
        linearsearch_in_range(array, target,1,4);


    }

    static void linearsearch(int[] array , int target) {
        for(int i=0;i<array.length;i++ ) {
            if(target == array[i]) {
                System.out.println(target +" found at index : " + i );

            }
        }
    }

    static void linearsearch_in_range(int[] array , int target, int start, int end) {
        for(int i=start;i<=end;i++ ) {
            if(target == array[i]) {
                System.out.println(target +" found at index : " + i );

            }
        }
    }

    static boolean search( String name, char Target) {
        for(int i=0;i<name.length();i++) {
            if(Target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search1( String name, char Target) {
        for(char ch : name.toCharArray()) {
            if(Target == ch) {
                return true;
            }
        }
        return false;
    }





}
