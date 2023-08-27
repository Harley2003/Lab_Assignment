package demo_exception;

public class Main {

    public static void main(String[] args) {
        try {
            RightTriangle triangle = new RightTriangle(3, 4, 5);
            System.out.println("Triangle sides: " + triangle.getA() + ", " + triangle.getB() + ", "
                    + triangle.getC());
        } catch (IllegalTriangleException e) {
            System.out.println("IllegalTriangleException: " + e.getMessage());
        } catch (IllegalRightTriangleException e) {
            System.out.println("IllegalRightTriangleException: " + e.getMessage());
        }
    }
}
