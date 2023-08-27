package OOP;

public class Car {

    private String Colour;
    private int EnginePower;
    private boolean Convertible, parkingBrake;

    public Car() {
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        parkingBrake = false;
    }

    public Car(String colour, int EnginePower, boolean Convertible, boolean parkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You can press the star button");
    }

    public void pressAcceleratorButtom() {
        System.out.println("You can press the accelerator button");
        System.out.println("Colour: " + Colour);
        System.out.println("EnginePower: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("parkingBrake: " + parkingBrake);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButtom();
        
        Car c2 = new Car();
        c2.pressAcceleratorButtom();
        
        Car c3 = new Car("red", 100, true, true);
        c3.pressStartButton();
        c3.setColour("black");
        System.out.println("Colour of c3: " + c3.getColour());
        
    }
}
