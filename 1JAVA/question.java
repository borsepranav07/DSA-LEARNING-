import java.util.Scanner;






public class question {


    // static boolean isprime(int n) {
    //     if(n <= 1) {
    //         return false;
    //     }

    //     int c = 2;
    //     while(c*c <= n) {
    //         if(n%c == 0) {
    //             return false;
    //         }
    //         c++;
    //     }
    //     return c*c > n;
    // }


    static boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;

    while (n > 0) {
        int rem = n % 10;
        sum += rem * rem * rem;
        n = n / 10;
    }

    return sum == original;
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "kunal";
        String b = "kunal";

        System.out.println(a==b);


        System.out.println("enter a fruit : ");
        String fruit = input.next();

        if(fruit.equals("mango")) {
            System.out.println("king of fruits");
        }
        if(fruit.equals("apple")) {
            System.out.println("a sweet red fruit");
        }



        //  switch statements :
        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
        
            case "apple":
                System.out.println("a sweet red fruit");
                break;
        
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            
        
            default:
                System.out.println("please enter a valid fruit");
                break;
        }



        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");

        }

        int day = input.nextInt();
        switch(day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }

        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }

        //  nested switch :
        int empid = input.nextInt();
        String department = input.next();

        switch(empid) {
            case 1:
                System.out.println("kunal kushwaha");
                break;
            case 2:
                System.out.println("rahul rana");
                break;
            case 3:
                System.out.println("emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("no department entered");
                        break;

                }
            default:
                System.out.println("enter correct empID ");
                
        }


        // prime numner :

        System.out.println("enter a number : ");
        int n = input.nextInt();
        // System.out.println(isprime(n));
        System.out.println(isArmstrong(n));



    }
    
}
