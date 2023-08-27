package PracticalClass;

public class Emp {
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
        return s;
    }
    
    
    
}
