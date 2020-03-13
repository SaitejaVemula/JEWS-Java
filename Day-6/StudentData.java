import java.util.Scanner;

class StudentData {

    public static void main(String[] args) {
        // Making a reference object for Scanner, named sc.
        Scanner sc = new Scanner(System.in);

        // Reading the arraySize from the user.
        System.out.print("Enter the number of students :  ");
        int arraySize = sc.nextInt();

        // Declaraing all the arrays with the given arraySize.
        String[] studentNames = new String[arraySize];
        int[][] individualMarks = new int[arraySize][3];
        int[] totals = new int[arraySize];
        float[] averages = new float[arraySize];
        boolean[] isFail = new boolean[arraySize];

        // Using a loop to read all the values of each student's name, their marks.
        // And calculating the total and averages here itself.
        for (int i = 0; i < arraySize; i++) {

            // Reading the Student's name.
            System.out.println("Enter the name of student " + (i + 1) + " :  ");
            studentNames[i] = sc.next();

            totals[i] = 0; // initialing the value to zero.
            System.out.print("Enter " + studentNames[i] +"'s marks of subject 1, subject 2 and subject 3 :  ");


            isFail[i] = false; // initializing the value to false, so that we are treating them as passed by default.

            //Another loop, used to read the marks of each subject.
            for (int j = 0; j < 3; j++) {
                individualMarks[i][j] = sc.nextInt();

                if ( individualMarks[i][j] < 30 ) {
                    isFail[i] = true;
                }

                //Calculating the total as the marks are being stored.
                totals[i] += individualMarks[i][j];
            }

            // Calculating the averages of each student.
            averages[i] = totals[i] * 1.0f / 3;

        }

        // Asking the user to 
        System.out.print("Enter the name of the student to see his/her result :  ");
        String studentName = sc.next();

        int i = 0;
        for(String name : studentNames) {
            if (studentName.equalsIgnoreCase(name)) {
                System.out.println("--------------------------------------");
                System.out.println("Name : " + name);
                System.out.println("Subject 1 : " + individualMarks[i][0] );
                System.out.println("Subject 2 : " + individualMarks[i][1] );
                System.out.println("Subject 3 : " + individualMarks[i][2] );
                System.out.println("Total : " + totals[i]);
                System.out.println("Average : " + averages[i]);
                System.out.println("--------------------------------------");
                System.out.print("Grade/Status : ");

                if ( isFail[i] ) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Passed");
                }
                System.out.println("--------------------------------------");
            }

            i++;
        }

    }

}