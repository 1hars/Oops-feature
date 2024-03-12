package Interface;


abstract class Vehicle{
    int no_of_tyre;
    Vehicle(int no_of_tyre){
        this.no_of_tyre = no_of_tyre;
    }
    abstract void key();
}
class Car extends Vehicle{
    Car(int no_of_tyre){
        super(no_of_tyre);
    }
    void key(){
        System.out.println("Start with key");
    }

}
public class Implemet {
    public static void main(String[] args) {
        Car car = new Car(2);
        System.out.println(car.no_of_tyre);
        car.key();
    }
}
