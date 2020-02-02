package ClassesAndAttributes;

public class ClassesAndAttributes {

    public static int publicStaticNum;
    public int publicNum;
    int privateNum;


//    public static void main(String[] args) {
//        publicStaticMethod();
//        privateStaticMethod();
//
//    }

    private static void privateStaticMethod() {
        System.out.println("From the private static method.");
    }

    public static void publicStaticMethod() {
        System.out.println("From the public static method.");
    }

    public void publicNONStaticMethod() {
        System.out.println("From the public NON-Static method.");
    }
}
