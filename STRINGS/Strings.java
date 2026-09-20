import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;  
        System.out.println(result);

        String name = "my name is pranav borse";
        System.out.println(name.toUpperCase());

        String fullName = "John Doe";
        // Length
        int length = fullName.length();
        System.out.println("Length of fullName: " + length);



        System.out.print("Enter a string: ");
        // String input = sc.next();
        String input = sc.nextLine();
        System.out.println("You entered: " + input);





        // functions :

        // 1. concatenation :
        String str3 = "Hello";
        String str4 = "World";
        String concatenated = str3.concat(" ").concat(str4);
        System.out.println("Concatenated String: " + concatenated);

        // 2. length :
        String str5 = "Hello World";
        int len = str5.length();
        System.out.println("Length of str5: " + len);



        // charAt() :
        String str6 = "Hello";
        char ch = str6.charAt(1);
        System.out.println("Character at index 1: " + ch);

        //  compareTo() :
        String str7 = "apple";
        String str8 = "banana";
        int comparison = str7.compareTo(str8);
        System.out.println("Comparison result: " + comparison);


        // subsrting :
        String str9 = "Hello Worldasjqgduqwdqwd";
        // String substring = str9.substring(6);
        String substring = str9.substring(0, 20);
        System.out.println("Substring from index 0 to 20: " + substring);





        // string builder:

        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.append(" World");
        System.out.println(sb);

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(2, 'p');
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);


        // reverse string :

        StringBuilder st = new StringBuilder("samarth lawande");
        int n = st.length();

        for(int i=0;i<n/2;i++) {

            int front = i;
            int back = n-i-1;

            char frontChar = st.charAt(front);
            char backChar = st.charAt(back);

            st.setCharAt(front, backChar);
            st.setCharAt(back, frontChar);




        }

        System.out.println(st);









    }

}