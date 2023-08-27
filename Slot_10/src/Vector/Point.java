package Vector;

public class Point {
    int x, y;

    public Point() {
        x=0;
        y=0;
    }

    public Point(int xx, int yy) {
        x=xx;
        y=yy;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
