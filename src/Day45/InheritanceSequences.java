package Day45;

public class InheritanceSequences {
    public static void main(String[] args) {
        System.out.println("It starts!");

        C c = new C();
    }
    static {
        System.out.println("Main static");
    }
}

class A {

    static {
        System.out.println("Class A in static");
    }

    {
        System.out.println("Class A not static");
    }
}

class B extends A {
    static int number = 5;

    static {
        System.out.println("Class B in static");
    }
}

class C extends B {

    static {
        System.out.println("Class C in static");
    }
}