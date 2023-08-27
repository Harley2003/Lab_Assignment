package demo_exception;

public class RightTriangle {

    private int a, b, c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException,
            IllegalRightTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Triangle sides must be positive integers.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Invalid triangle sides.");
        }
        if (a * a + b * b != c * c && a * a + c * c != b * b && b * b + c * c != a * a) {
            throw new IllegalRightTriangleException("Not a right triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    
}
