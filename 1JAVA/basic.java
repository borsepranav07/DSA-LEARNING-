
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {


        System.out.println("Hello Java");
        System.out.println("my name is pranav");


        

        
        // 1. Variables
        // A variable stores data in memory.
        
        String name = "Pranav";
        System.out.println("Name: " + name);
        // String → data type (stores text)
        // name → variable name
        // = → assignment operator
        // "Pranav" → value stored
        
        int age = 20;
        System.out.println("Age: " + age);

        // int → integer data type
        // age → variable name
        // 20 → value





        // 2. Data Types
        // Java requires you to specify the type of data being stored.
        // Common data types:

        // DataType   Stores	         Example
        // int	      Whole numbers	       10
        // double	  Decimal numbers	   5.6
        // char	       single character    'A'
        // String	  Text	                "Hello"
        // boolean	  True/False	        true
        //  float      decimal number        98.56f
        // long        large integer          234234234234234l


        int Marks = 95;
        double price = 10.99;
        char grade = 'A';
        boolean pass = true;
        String city = "Nashik";

        // 3. String Concatenation (+)

        System.out.println("City: " + city);


        // 2: Taking input from the user (Scanner).
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String firstname = sc.nextLine();

        System.out.print("Enter your age: ");
        int Age = sc.nextInt();

        System.out.println("Hello " + firstname);
        System.out.println("Your age is " + Age);

        

        // Common Scanner methods

        // Method	        Reads
        // next()	        Single word
        // nextLine()	    Entire line
        // nextInt()	    Integer
        // nextDouble()	    Decimal number
        // nextFloat()	    Float
        // nextBoolean()	true / false

        System.out.print("enter a decimal number : ");
        double decimal_number = sc.nextDouble();

        System.out.println("Your decimal number is :  " + decimal_number);

        


        
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();

        float sum = num1 + num2;
        System.out.println("sum : " + sum);



        // type casting :
        float Num = sc.nextFloat();
        System.out.println(Num);

        int NUm = (int)(67.76f);
        System.out.println(NUm);

        //  ascii letters ;
        int number = 'A';   //65
        int numb = 'a';     //97
        System.out.println(number);
        System.out.println(numb);







        // 3: Operators (+, -, *, /, %)
        // Operators are symbols that perform operations on values and variables.

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));       

        int num = 8;

        if (num % 2 == 0) {
            System.out.println("Even");
        }


        // Assignment operators
        // Used to assign or update values:
        int x = 10;

        x += 5;   // x = x + 5
        System.out.println(x);
        x -= 2;   // x = x - 2
        System.out.println(x);
        x *= 3;   // x = x * 3
        System.out.println(x);
        x /= 2;   // x = x / 2
        System.out.println(x);


        // Increment and Decrement
        int y = 5;

        y++;
        System.out.println(y);

        y--;
        System.out.println(y);



        // Comparison operators
        // These return true or false.

        //  Operator	     Meaning
        //  ==	             Equal to
        //  !=	             Not equal
        //  >	             Greater than
        //  <	             Less than
        //  >=	             Greater than or equal
        //  <=	             Less than or equal

        int c = 10;
        int d = 5;

        System.out.println(c > d);
        System.out.println(c == d);

        // Logical operators
        // Used to combine conditions:
        // Operator	  Meaning
        // &&	      AND
        // !	      NOT
        // ||         OR

        int AGE = 20;
        System.out.println(AGE > 18 && AGE < 60);

        int r = 10;
        int t = 67;
        if(r==10 || t==3) {
            System.out.println("True");
        }
        if(r==10 && t==67) {
            System.out.println("False");
        }
        if(r!=10) {
            System.out.println("hshsh");
        }




        // Conditions (if, else if, else)

        int AGe = 20;

        if (AGe >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }


        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }


        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive");
            }
        }


        if (age >= 18 && age <= 60) {
            System.out.println("Working age");
        }


        int NUM = 234;
        String result = (NUM % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);





        // basic calculator :

        int ans = 0;
        while(true) {
            System.out.print("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                int NUMBER1 = sc.nextInt();
                int NUMBER2 = sc.nextInt();

                if( op == '+') {
                    ans = NUMBER1+NUMBER2;
                }
                else if( op == '-') {
                    ans = NUMBER1-NUMBER2;
                }
                else if( op == '*') {
                    ans = NUMBER1*NUMBER2;
                }
                else if( op == '/') {
                    ans = NUMBER1/NUMBER2;
                }
                else if( op == '%') {
                    ans = NUMBER1%NUMBER2;
                }
            }
            else if(op =='x' || op == 'X') {
                break;
            }
            else {
                System.out.println("invalid input");
            }
                


            System.out.println(ans);
            
        }
            




    }
}