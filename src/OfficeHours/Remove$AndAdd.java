package OfficeHours;

public class Remove$AndAdd {
    //    Get the String Array $115, $23 and $75 remove the $ and add them up.
    public static void main(String[] args) {
    String[] money = {"$115", "$23", "$75"};
    int amount = 0, sum = 0;
        for (int i = 0; i < money.length; i++) {
            amount  = Integer.valueOf(money[i].substring(1));
            sum += amount;
        }
        System.out.println("The total is $" + sum);
    }
}
