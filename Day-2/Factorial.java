import java.util.Scanner;

class Factorial {

    public static void main( String[] a ) {
        Scanner scan = new Scanner( System.in );
        long result;
        System.out.print("Enter a number to find its factorial :  ");
        int num = scan.nextInt();

        result = factorial(num);

        System.out.print("Factorial of " + num + " is " + result + ".");
    }

    static long factorial( int num ) {
        long result;

        if ( num == 0 || num == 1 ) 
            return 1;

        for( result = 1; num > 1; result *= num-- );

        return result;
    }

}