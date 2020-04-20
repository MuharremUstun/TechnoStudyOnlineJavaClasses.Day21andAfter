package Day40;

class Animal {
    String name;

    private Animal(){};
    public Animal(String name) {
        this.name = name;
    }

    public Animal(int x){

    }
}

class Dogs extends Animal {
    boolean ifBarks;

    public Dogs(String name, boolean ifBarks) {
        super(name);
        this.ifBarks = ifBarks;
    }

    private Dogs(int x, boolean ifBarks){
        super(x);
    }
}

class Cats extends Animal {
    boolean ifMeaus = true;

    public Cats(String name, boolean ifMeaus) {
        super(name);
        this.ifMeaus = ifMeaus;
    }
}

public class InheritanceDemo {


}
