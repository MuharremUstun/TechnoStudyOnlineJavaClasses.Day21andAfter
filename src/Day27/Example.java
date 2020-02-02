package Day27;

import ClassesAndAttributes.ClassesAndAttributes;

public class Example {
    int x = 5;
    public static void main(String[] args) {
        ClassesAndAttributes ex1 = new ClassesAndAttributes();

        ClassesAndAttributes.publicStaticMethod();
        ex1.publicStaticMethod();

//        ClassesAndAttributes.publicNONStaticMethod();
        ex1.publicNONStaticMethod();

        ex1.publicStaticNum = 5;
        ClassesAndAttributes.publicStaticNum = 20;

        Example ex2 = new Example();
        System.out.println(ex2.x);
    }

    void deneme() {
        ClassesAndAttributes ex2 = new ClassesAndAttributes();
        ex2.publicNONStaticMethod();
        ex2.publicStaticMethod();
        ClassesAndAttributes.publicStaticMethod();
        System.out.println(x);
    }


}
