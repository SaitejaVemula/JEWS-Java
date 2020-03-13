import java.util.Scanner;

public class Divisibility {
    public static void main( String[] args ) {
        System.out.print("Enter the size of the integer array :  ");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        System.out.print("Enter " + arrSize + " integer values to store them in the array :  ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to check the divisibility with :  ");
        int num = sc.nextInt();
        int count = 0;
        String divisibleNumbers = "";

        for(int i : arr) {
            if (i % num == 0) {
                count++;
                divisibleNumbers += i + " ";
            }
        }

        if(count == 1) {
            System.out.println("There is only " + count + " number that is divisible by " + num +".");
            System.out.println("And the number is :  " + divisibleNumbers + ".");
        } else {
            System.out.println("There are " + count + " numbers that are divisible by " + num +".");
            System.out.println("And the numbers are :  " + divisibleNumbers + ".");
        }

    }
}