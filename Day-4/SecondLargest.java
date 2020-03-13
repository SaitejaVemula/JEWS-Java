import java.util.Scanner;
class SecondLargest {

    static int secondLargest(int[] arr) {
        int max1=arr[0], max2=arr[0];
        for(int i : arr) {
            if(i>max1)
                max1 = i;
        }

        for(int i : arr) {
            if(i>max2 && i<max1)
                max2 = i;
        }

        return max2;
    }

    static int secondLargest2(int[] a) {
        int m1=a[0], m2=a[0];

        for(int i : a) {
            if(i>m1) {
                m2 = m1;
                m1 = i;
            }
        }

        return m2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 elements to store them in an array :  ");
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        
        for(int item : arr) {
            System.out.print(item + " ");
        }

        // System.out.println("\nThe second largest element in the array is : " + secondLargest(arr));
        System.out.println("\nThe second largest element in the array is : " + secondLargest2(arr));
        
    }
}