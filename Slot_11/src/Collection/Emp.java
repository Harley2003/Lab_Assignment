package Collection;
import java.util.*;

public class Emp implements Comparable<Emp> {

    String name;
    int age;
    double income;

    public Emp() {
    }

    public Emp(String xname, int xage, double xincome) {
        name = xname;
        age = xage;
        income = xincome;
    }

    @Override
    public String toString() {
        String s = "(" + name + ", " + age + ", " + income + ")";
        return (s);
    }

    @Override
    public int compareTo(Emp x) {
        if (age < x.age) {
            return (-1);
        } else if (age == x.age) {
            return (name.compareTo(x.name));
        }
        return (1);
    }

}
