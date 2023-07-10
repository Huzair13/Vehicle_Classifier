public class Main {
    public static void main(String[] args) {

        //Vehicles object instance is created
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.stop();

        //Car object instances is created
        Car car=new Car();
        car.start();
        car.stop();

        //Motorcycle object instances in created
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();
        motorcycle.stop();

    }
}

//Vehicle Entity
class Vehicle{

    //Start Method
    public void start(){
        System.out.println("Vehicle Started");
    }

    //Stop Method
    public void stop(){
        System.out.println("Vehicle stopped");
    }
}

//Car Entity
class Car extends Vehicle{

    //Overriding start method car
    public void start(){
        System.out.println("Car Started");
    }

    //Overriding stop method for car
    public void stop(){
        System.out.println("Car Stopped");
    }
}

class Motorcycle extends Vehicle{

    //Overriding start method Motorcycle
    public void start(){
        System.out.println("Motorcycle Started");
    }

    //Overriding stop method for Motorcycle
    public void stop(){
        System.out.println("Motorcycle Stopped");
    }
}