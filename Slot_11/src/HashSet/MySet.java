package HashSet;

import java.util.*;

public class MySet extends HashSet {
            public boolean isEmpty() {
            return (super.isEmpty());
        }

        void add(A x) {
            super.add(x);
        }

        void addMany(String[] a, int[] p, int n) {
            A x;
            for (int i = 0; i < n; i++) {
                x = new A(a[i], p[i]);
                add(x);
            }
        }

        void display() {
            System.out.println("The elements of the list: ");
            Iterator h = iterator();
            while (h.hasNext()) {
                System.out.println(h.next());
            }
        }
}
