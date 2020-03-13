import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        int [] a;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of : ");
        i = sc.nextInt();

        a = new int[i];

        for(int x=0; x<a.length; x++) {
            System.out.print("Enter the "+ (x+1) + " item :  ");
            a[x] = sc.nextInt();
        }

        System.out.println("Array items :  ");
        for(int x : a) {
            System.out.print(x + "\t");
        }
    }
    
}