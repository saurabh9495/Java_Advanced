package oops;

public class Vehicle {
    private String name ="";
    private String color="";
    private String model="";
    private String company="";
    private String engine = "1000";
    public static int count = 0;

    //Empty Constructor
    public Vehicle(){
        count++;
    }

    //parametrized Constructor
    public Vehicle(String name, String color, String model, String company, String engine){
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    //getters
    public String getName(){
        return this.name;
    }
    public String  getColor(){
        return this.color;
    }
    public String getModel(){
        return this.model;
    }
    public String getCompany(){
        return this.company;
    }
    private String getEngine(){
        return this.engine;
    }

    public int getSpeed(){
        String a = getEngine();
        if(a=="1000"){
            return 100;
        }
        else {
            return 80;
        }
    }
}
