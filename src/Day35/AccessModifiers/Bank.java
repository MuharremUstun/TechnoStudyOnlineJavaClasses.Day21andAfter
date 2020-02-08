package Day35.AccessModifiers;

public class Bank {
    private String name = "Chase";

    public String printName(){
        return "Name of the bank is " + name;
    }
}

class BankAttributes {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.printName());
    }
}