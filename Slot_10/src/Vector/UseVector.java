package Vector;

import java.util.Vector;

public class UseVector {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(15);
        v.add("Hello");
        v.add(new Point());
        v.add(new Point(5, -7));
        System.out.println(v);
        v.remove(2);
        for (int i = 0; i < v.size(); i++) {
            System.out.printf(v.get(i) + " , ");
        }
        System.out.println();
    }
}
