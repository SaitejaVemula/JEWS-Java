public class Student {
    
    public int m1, m2, m3, total;
    public float average;
    final private String studentName;

    public Student(String name) {
        studentName = name;
    }

    public void setMarks(int s1, int s2, int s3) {
        m1 = s1;
        m2 = s2;
        m3 = s3;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTotal() {
        return total;
    }

    public float getAverage() {
        return average;
    }

}