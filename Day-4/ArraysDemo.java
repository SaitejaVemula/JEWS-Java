import java.util.Scanner;

class ArraysDemo {
    public static void main(String[] args) {
        int demo[] = {9,9,9,9,9,9,9,9,9,9}, i=0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext() && i < 7) {
            demo[i++] = sc.nextInt();
        }

        System.out.print("demo 0 " + demo[0] + "\t");
        System.out.print("demo 1 " + demo[1] + "\t");
        System.out.print("demo 2 " + demo[2] + "\t");
        System.out.print("demo 3 " + demo[3] + "\t");
        System.out.print("demo 4 " + demo[4] + "\t");
        System.out.print("demo 5 " + demo[5] + "\t");
        System.out.print("demo 6 " + demo[6] + "\t");
        System.out.print("demo 7 " + demo[7] + "\t");
        System.out.print("demo 8 " + demo[8] + "\t");
        System.out.print("demo 9 " + demo[9] + "\t");
    }
}