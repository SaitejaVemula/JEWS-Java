public class GradeCalculator {
    Student s;

    public GradeCalculator (Student ss) {
        s = ss;
    }

    public void calculateTotal() {
        s.total = s.m1 + s.m2 + s.m3;
    }

    public void calculateAverage() {
        s.average = s.total * 1.0f / 3;
    }
}