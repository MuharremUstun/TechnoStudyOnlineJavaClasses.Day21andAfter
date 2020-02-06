package Day31;

public class Food {

    public String name;
    public String sideDish;
    public String ingredients;
    public String oil;
    public int amountOfIngredients;

    public boolean hasButter(String text) {
        if (oil.equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public void taste() {
        if (amountOfIngredients == 2) {
            System.out.println("OK");
        } else if (amountOfIngredients == 3) {
            System.out.println("Delicious");
        } else if (amountOfIngredients == 6) {
            System.out.println("Mouthwatering");
        }

    }
}