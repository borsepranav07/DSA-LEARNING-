import java.lang.foreign.MemorySegment.Scope;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Scanner;



public class function {


    // void does not return it directly print that value we have to call that function only :  
    static void greet(String name) {
        System.out.println("Hello Java");
        System.out.println("Hello " + name);
    }

    // int return some value so we have to print that function to return a vlaue :
    static int add(int a, int b) {
        return a+b;
    }
    
    static double add(double c, double d) {
        return c+d;
    }

    static void display() {
        int number = 10;  // Local variable
        System.out.println(number);
    }
    
    static int sum() {
        // inside the functions value cannot access outside the function:

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 :");
        int number1 = input.nextInt();
        System.out.println("enter number 1 :");
        int number2 = input.nextInt();

        System.out.print("the sum is : ");
        return number1+number2;

    }

    static void greeet(String name) {
        System.out.println("Hello " + name);
    }



    public static void main(String[] args) {

        greet("pranav");
        greet("borse");
        greet("rahul");

        System.out.println(add(23,56));
        System.out.println(add(545,4564));
        System.out.println(add(234.234234,456.2131));


        System.out.println(sum());

        //  swap two numbers ;
        int A = 23;
        int B = 56;

        int temp = B;
        B = A;
        A = temp;

        System.out.println(A);
        System.out.println(B);






        // In Java, method scope refers to the region of code where variables declared inside a method are accessible.
        // Key Points
        // Local variables declared inside a method can only be used within that method.
        // Variables declared inside a block ({}) within a method are only accessible inside that block.
        // Method parameters are also local to the method.



        // Example 1: Local Variable Scope :
    
        display();
        // System.out.println(number); // Error: number is not visible here
        
        // Here, number exists only inside the display() method.



        // Example 2: Block Scope Inside a Method :

        int x = 5;

        if (x > 0) {
            int y = 10;
            System.out.println(y); // Works
        }

        // System.out.println(y); // Error: y is out of scope
        // The variable y is accessible only inside the if block.





        // Example 3: Method Parameter Scope:

        greeet("Alice");
        // System.out.println(name); // Error: name is not visible here
        // The parameter name is available only inside the greet() method.
        
        // Scope Hierarchy in Java
        // Class Scope → Fields (instance/static variables) accessible throughout the class.
        // Method Scope → Parameters and local variables accessible only within the method.
        // Block Scope → Variables declared inside {} accessible only within that block.
        // 
        // Summary: Variables declared in a method are local to that method and cannot be accessed outside it. Variables declared inside inner blocks have an even smaller scope limited to that block.
        


        // Loop Scope in Java

        // Loop scope means that variables declared inside a loop are accessible only within that loop.

        // There are three common loops in Java:

        // for loop
        // while loop
        // do-while loop

        // 1. for Loop Scope:
        // Variables declared in the for loop initialization are only available inside the loop.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // Error: i cannot be resolved



        // 2. Variable Declared Inside the Loop Body:
        for (int i = 1; i <= 3; i++) {
            int square = i * i;
            System.out.println(square);
        }

        // System.out.println(square); // Error


        // 3. Using a Variable After the Loop
        // If you need to use a variable after the loop, declare it before the loop.

        int i;

        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Final value of i = " + i);

        // 4. while Loop Scope:
        int j = 1;

        while (j <= 3) {
            int r = j * 10;
            System.out.println(r);
            i++;
        }

        // System.out.println(r); // Error


        // 5. do-while Loop Scope:
        int p = 1;

        do {
            int value = p * 2;
            System.out.println(value);
            p++;
        } while (p <= 3);

        // System.out.println(value); // Error





        


    }
    
}

















// Shadowing in Java:
// Shadowing occurs when a variable declared in an inner scope (such as a method or block) has the same name as a variable declared in an outer scope. The inner variable hides (shadows) the outer variable within its scope.

// Example 1: Local Variable Shadows Instance Variable:
public class Student {

    int age = 20;   // Instance variable

    void display() {
        int age = 25;   // Local variable shadows instance variable

        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

// output : 25


// 'Example 2: Accessing the Shadowed Variable using this:
public class Student {

    int age = 20;

    void display() {
        int age = 25;

        System.out.println("Local age: " + age);
        System.out.println("Instance age: " + this.age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

// output :
// Local age: 25
// Instance age: 20

// Example 3: Parameter Shadowing :

public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s = new Student("Pranav");
        s.display();
    }
}



// Example 4: Block Shadowing? :
public class Main {
    public static void main(String[] args) {

        int x = 10;

        {
            // int x = 20;   // Compile-time Error
        }
    }
}

// This is not allowed in Java. You cannot declare another local variable with the same name in an overlapping scope.




// Variable Arguments (Varargs) in Java :
// Varargs (Variable Arguments) allow a method to accept zero or more arguments of the same type.

public class Main {

    static void printNumbers(int... numbers) {

        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        printNumbers(10);
        printNumbers(10, 20);
        printNumbers(10, 20, 30, 40, 50);
    }
}


// Example 2: Sum Using Varargs :

public class Main {

    static int sum(int... numbers) {

        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30, 40));
    }
}


// Example 3: String Varargs: 
public class Main {

    static void names(String... students) {

        for (String name : students) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        names("Pranav");
        names("Pranav", "Rahul", "Amit");
    }
}

// Example 1: Different Number of Parameters :
// Method Overloading means defining multiple methods with the same name in the same class, but with different parameter lists (different number, type, or order of parameters).

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}

// Example 2: Different Data Types :

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
    }
}

// Example 3: Different Order of Parameters :
public class Demo {

    static void display(int a, String name) {
        System.out.println(a + " " + name);
    }

    static void display(String name, int a) {
        System.out.println(name + " " + a);
    }

    public static void main(String[] args) {

        display(101, "Pranav");
        display("Rahul", 102);
    }
}


// Method Overloading with Varargs :
public class Demo {

    static void show(int a) {
        System.out.println("One integer");
    }

    static void show(int... a) {
        System.out.println("Varargs");
    }

    public static void main(String[] args) {

        show(10);
        show(10, 20);
    }
}