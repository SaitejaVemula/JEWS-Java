public class Operations {

    private String userName;

    public Operations() {
        userName = "Blue Barbarian";
    }

    public Operations(String name) {
        userName = name;
    }

    public String getUserName() {
        return userName;
    }

    public int addition(int a, int b) {
        return a + b;
    }
    
    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    
    public int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    
    public int addition(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public int addition(int[] arr) {
        int result = 0;
        for(int item : arr) { result += item; }

        return result;
    }
}