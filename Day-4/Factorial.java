import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial :  ");
        int num = scan.nextInt();

        System.out.print("Factorial of " + num + " is " + factorial(num) );
    }

    static long factorial(int num) {
        if( num == 0 || num == 1 )
            return 1;
        return num * factorial(--num);
    }
}