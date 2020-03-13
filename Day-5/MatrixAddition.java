import java.util.Scanner;
class MatrixAddition {
    public static void main(String[] args) {
        int s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sizes of the matrix :  ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();

        int[][] matrix1 = new int[s1][s2],
                matrix2 = new int[s1][s2],
                sum     = new int[s1][s2];


        System.out.println("Enter the values for matrix 1 : ");
        for(int i=0; i<matrix1.length; i++) {
            for(int j=0; j<matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values for matrix 2 : ");
        for(int i=0; i<matrix2.length; i++) {
            for(int j=0; j<matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();

                // sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of matrix 1 and matrix 2 is : ");

        sum = sumOfMatrix(matrix1, matrix2);

        for(int i=0; i<sum.length; i++) {
            for(int j=0; j<sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }

    static int[][] sumOfMatrix(int[][] m1, int[][] m2) {
        int s1, s2;
        s1 = m1.length;
        s2 = m1[0].length;

        int[][] sum = new int[s1][s2];

        for(int i = 0; i<m1.length; i++)
            for(int j = 0; j<m1[i].length; j++)
                sum[i][j] = m1[i][j] + m2[i][j];

        return sum;
    }
}