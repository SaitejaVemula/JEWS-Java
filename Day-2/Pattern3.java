/* 
    11111
    10001
    10001
    10001
    11111
*/

import java.util.Scanner;

class Pattern3 {

    static void pattern3(int n) {

        int i = 1, j = 1, p = 1;
        while ( i <= n ) {
            if ( j <= n ) {
                if ( j == 1 || j == n || i == 1 || i == n ) { p = 1; }
                else { p = 0; }
                System.out.print(p + " ");
                j++;
            } else {
                i++;
                j = 1;
                System.out.println();
            }
        }

    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :   ");
        int num = scan.nextInt();

        pattern3(num);
    }

}