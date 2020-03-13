import java.util.*;
import java.io.*;

class LoopsHR{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // for(int x=0; x<n; x++) {
            //     int sum = a;
            //     for(int y=0; y<=x; y++) {
            //         sum += Math.pow(2, y) * b;
            //     }
            //     System.out.print(sum + " ");
            // }
            int x = 0, y = 0, sum = a;
            while(x < n) {           

               if(y <= x) {
                   sum += Math.pow(2,y) * b;
                   y++;
               } else {
                   System.out.print(sum + " ");
                   x++;
                   y = 0;
                   sum = a;
               }

            }
            
            System.out.println();
        }
        in.close();
    }
}