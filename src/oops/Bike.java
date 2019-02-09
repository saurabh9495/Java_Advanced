package oops;

public class Bike extends Car  {
    private boolean fourstroke = true;

    public Bike(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen, boolean fourstroke) {
        super(name, color, model, company, engine, powerSteering, ledScreen);
        this.fourstroke = true;
    }

    public void setFourstroke(boolean fourstroke) {
        this.fourstroke = fourstroke;
    }

    public boolean GetFourStroke(){
        return this.fourstroke;
    }
}
