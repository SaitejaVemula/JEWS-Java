/*
    55555
    55555
    55555
*/
import java.util.Scanner;
class Pattern2 {

    static void pattern2(int n) {

        int i=1;
        while ( i <= n ) {
            System.out.println("55555");
            i++;
        }

    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :   ");
        int num = scan.nextInt();

        pattern2(num);

    }

}