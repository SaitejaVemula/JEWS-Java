import java.io.Console;
class RepeatingElement {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Console a = System.console();

        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(a.readLine("Enter the %d element :  ",i));
        }

        int temp = arr[0], i = 1, j = arr.length;
    }
}