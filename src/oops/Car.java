package oops;

public class Car extends Vehicle {
    String name = "Scorpio";
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public String getName(){
        return this.name;
    }
    public void SetPowerSteering(boolean powerSteering){
        this.powerSteering = powerSteering;
    }
    public void SetLedScreen(boolean ledScreen){
        this.ledScreen = ledScreen;
    }

    public boolean GetPowerSteering(){
        return this.powerSteering;
    }
    public boolean GetLedScreen(){
        return this.ledScreen;
    }
}
