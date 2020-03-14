public class Main {

    public static void main(String[] args) {
        Operations obj1 = new Operations("Greek God");

        Operations obj2 = new Operations();

        System.out.println("Sum of 5 and 7 (called by " + obj1.getUserName() + ") :  " + obj1.addition(5,7));
        System.out.println("Sum of 5 and 7 (called by " + obj2.getUserName() + ") :  " + obj2.addition(5,7));

        System.out.println("Sum of 5, 7and 7 (called by " + obj1.getUserName() + ") :  " + obj1.addition(5,7,7));
        System.out.println("Sum of 5, 7 and 13 (called by " + obj2.getUserName() + ") :  " + obj2.addition(5,7,13));

        int[] arr = {5,6,7,8,21,435,147};
        System.out.println("Sum of integer array : " + obj1.addition(arr));

        Interest p25 = new Interest();
        Child1 p30 = new Child1();
        Child2 p15 = new Child2();

        System.out.println("25% of 900 is : " + p25.interest(900));
        System.out.println("30% of 900 is : " + p30.interest(900));
        System.out.println("15% of 900 is : " + p15.interest(900));

        p30.sayHello();
    }

}