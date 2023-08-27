package Inheritance;

public class Rectangle {

    private int length = 0, width = 0;

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
    
    public Rectangle (int l, int w) {
        length = l > 0? l: 0;
        width = w > 0? w: 0;
    }

    @Override
    public String toString() {
        return "[" + getLength() + ", " + getWidth() + "]";
    }
    
    public int area() {
        return length * width;
    }
    
}
