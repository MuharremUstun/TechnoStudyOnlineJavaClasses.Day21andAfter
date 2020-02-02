package ClassesAndAttributes;

public class MyClass {
    int x = 5;
    int y = 6;
    final static int d = 8;
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.x=10;
        System.out.println("From main method: " + obj.x);
        obj.printx();
    }

    private void printx() {
//        int x = 8;
        System.out.println(x);
//        System.out.println(MyClass.x);

//        MyClass obj2 = new MyClass();
//        System.out.println("From printx method: " + obj2.x);
    }
}
