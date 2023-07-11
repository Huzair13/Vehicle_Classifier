public class Main {
    public static void main(String[] args) {

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
abstract class Vehicle{

    //Start Method
    public abstract void start();

    //Stop Method
    public abstract void stop();
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