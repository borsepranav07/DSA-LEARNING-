
public class even_no_digits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, -7895};

        System.out.println(findNumbers(nums));
        // System.out.println(digits(345));
        // System.out.println(digits2(345));
        
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check the numbers contain even number of digits.
    static boolean even(int num) {
        int numberofdigits = digits(num);
        // int numberofdigits = digits(num);
        if(numberofdigits % 2 == 0) {
            return true;
        }
        return false;

    }

    // count number of digits :
    // static int digits(int num) {
    //     int count = 0;

    //     if(num < 0) {
    //         num = num* -1;
    //     }
        
    //     while(num>0) {
    //         count++;
    //         num = num / 10;
            
    //     }
    //     return count;
    // }


    // optimised solution :

    static int digits(int num) {
         if(num < 0) {
            num = num* -1;
        }
        return (int)(Math.log10(num))+1;
    }
    
    
    




}