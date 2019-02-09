package oops;

public class Main {

    public static void main(String[] args) {

        //Calling vehicle1 from class JAVA_OOPS.Vehicle containing default Constructor JAVA_OOPS.Vehicle
        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.getName());
        //Blank
        vehicle1.setName("Verna");
        //System.out.println(vehicle1.name);
        //Verna {But it's a bas practice to directly call a variable from a class}
        System.out.println(vehicle1.getName());
        //Verna
        System.out.println(vehicle1.count);

        //Calling vehicle2 from class JAVA_OOPS.Vehicle containing parametrized Constructor JAVA_OOPS.Vehicle
        Vehicle vehicle2 = new Vehicle("City","Black","2018","Honda","900");
        System.out.println(vehicle2.getName());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle2.count);

        Car car1 = new Car("Civic","Black","2019","Honda","2000",false,false);
        System.out.println(car1.getName());
        System.out.println(car1.GetLedScreen());

        Bike bike1 = new Bike("Ninja","Blue","2017","Kavasaki","300",false,false,true);
        System.out.println(bike1.GetFourStroke());
    }
}
