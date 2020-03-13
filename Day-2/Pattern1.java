/*
    1 1
    2 3 5
    4 5 6 15
    7 8 9 10 34
*/

import java.util.Scanner;

class Pattern1 {

    static void pattern1(int n) {

        int i=1, j=1, c = 1, sum = 0;

        while ( i <= n ) {

            if ( j <= i ) {
                sum += c;
                System.out.print(c++ + " ");
                j++;

            } else {
                i++;
                j = 1;
                System.out.println(sum);
                sum = 0;
            }

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = scan.nextInt();
        pattern1(num);

    }

}