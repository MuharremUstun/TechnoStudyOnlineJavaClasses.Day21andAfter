package Day28;

public class JavaExceptions {
    public static void main1(String[] args) {
        throw new ArithmeticException();
    }

    static ArithmeticException ea = new ArithmeticException();
    public static void main(String[] args)  {
        throw ea;
    }

}
