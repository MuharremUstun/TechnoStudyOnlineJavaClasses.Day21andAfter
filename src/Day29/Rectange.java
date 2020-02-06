package Day29;

import java.util.Collections;

public class Rectange {
    double a;
    double b;

    public double getPerimeter () {
        return 2*(a + b);
    }

    public double getArea () {
        return a*b;
    }

}

class Calculate {
    public static void main(String[] args) {
//        double a, b;
        Rectange rect1 = new Rectange();
        rect1.a = 5;
        rect1.b = 7;
        double perimeter = rect1.getPerimeter();
        double area = rect1.getArea();
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);


//        Math.random();
    }


}