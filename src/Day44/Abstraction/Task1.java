package Day44.Abstraction;

public class Task1 {
    public static void main(String[] args) {

        BaseClass bcdemo = new BaseClass() {
            @Override
            public void study() {

            }
        };
        BaseClass bc = new DerivedClass();
        bc.study();
    }
}
