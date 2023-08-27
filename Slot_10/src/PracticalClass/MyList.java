package PracticalClass;

import java.util.ArrayList;

public class MyList {

    ArrayList<Emp> t;

    public MyList() {
        t = new ArrayList<Emp>();
    }

    void clear() {
        t.clear();
    }

    boolean isEmpty() {
        return t.isEmpty();
    }

    void add(Emp x) {
        t.add(x);
    }

    void addMany(String a[], int b[], double c[]) {
        int n;
        n = a.length;
        for (int i = 0; i < n; i++) {
            add(new Emp(a[i], b[i], c[i]));
        }
    }

    void display() {
        int n;
        n = t.size();
        Emp x;
        for (int i = 0; i < n; i++) {
            x = t.get(i);
            System.out.println(x);
        }
    }

}
