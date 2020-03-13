public class Main {
    public static void main(String[] args) {
        Student mahesh = new Student("Mahesh Banoth");

        mahesh.setMarks(98, 82, 62);
        System.out.println("Marks of subject 1 : " + mahesh.m1);
        System.out.println("Marks of subject 2 : " + mahesh.m2);
        System.out.println("Marks of subject 3 : " + mahesh.m3);

        GradeCalculator gc = new GradeCalculator(mahesh);
        gc.calculateTotal();
        gc.calculateAverage();

        System.out.println("Total : " + mahesh.getTotal());
        System.out.println("Average : " + mahesh.getAverage());


        Student ravi = new Student("Ravi Kumar");

        ravi.setMarks(85, 99, 98);
        System.out.println("Marks of subject 1 : " + ravi.m1);
        System.out.println("Marks of subject 2 : " + ravi.m2);
        System.out.println("Marks of subject 3 : " + ravi.m3);

        gc = new GradeCalculator(ravi);
        gc.calculateTotal();
        gc.calculateAverage();

        System.out.println("Total : " + ravi.getTotal());
        System.out.println("Average : " + ravi.getAverage());

    }
}