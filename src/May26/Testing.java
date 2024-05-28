package java_code.May26;

public class Testing {
    int a = 0;
    int b = 0;
    private Testing() {
        System.out.println("Testing");
    }
    private Testing(int a) {
        this.a = a;
        System.out.println("Testing a");
    }

    private Testing(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Testing "+a+" and "+b);
    }
    public static Testing getTesting(int a, int b) {
        return new Testing(a, b);
    }
    public static Testing getTesting(int a) {
        return new Testing(a);
    }

    public void printVariables () {
        if(a != 0) {
            System.out.println(a);
        }
        if(b != 0) {
            System.out.println(b);
        }
    }
}
