package Day38;

import javax.imageio.stream.ImageInputStream;

class Counter{
    private static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
}

public class StaticFields {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

//        System.out.println(Counter.count);
    }
}
