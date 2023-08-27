package HashSet;

import java.util.*;

public class A implements Comparable {

    String name;
    int sal;

    public A() {
    }

    public A(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public boolean equals(Object x) {
        A y = (A) x;
        return (sal == y.sal);
    }

    @Override
    public int compareTo(Object x) {
        A y = (A) x;
        if (sal < y.sal) {
            return (-1);
        } else if (sal == y.sal) {
            return (0);
        } else {
            return (1);
        }
    }

    @Override
    public String toString() {
        return (name + " " + sal);
    }

}
