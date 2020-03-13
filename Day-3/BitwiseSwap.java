import java.util.Scanner;
class BitwiseSwap {

    static void swap(int a, int b) {

        // Logic statements to swap the values of a and b by using XOR Operator (^).

        // a ^= (b ^= (a ^= b) );

        b ^= (a ^= b);
        a ^= b;

        // a = a ^ b;
        // b = b ^ a;
        // a = a ^ b;

        // a = (a + b) - (b = a);

        // Just a print statement to show the values after swapping, in "swap" method.
        System.out.println("After swapping (in \"swap\" module)");
        System.out.println("a = " + a + ", b = " + b);

    }

    public static void main (String[] args) {

        // Creating an object called "scanner" to utilize the scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of a and b :  ");
        
        // Reading the values of a and b.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Just a print statement to show the values before calling the "swap" method.
        System.out.println("Before swapping (in \"main\" module)");
        System.out.println("a = " + a + ", b = " + b);

        // Making a call to "swap" method and sending it the values.
        swap(a, b);
        
        // Just another print statement to show the values of a and b in "main", after calling the "swap" method.
        System.out.println("After swapping (in \"main\" module)");
        System.out.println("a = " + a + ", b = " + b);

    }

}