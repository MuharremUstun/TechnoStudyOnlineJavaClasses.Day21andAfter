package Day42;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(String color, boolean isFilled, int width, int length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
