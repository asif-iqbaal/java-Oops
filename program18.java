// Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft
// , Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the
// three classes.

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is fly");
    }
}
class Airplane implements Flyable{
    @Override
      public void fly_obj(){
        System.out.println("Airplane is fly");
    }
}
class Helicopter implements Flyable{
    @Override
      public void fly_obj(){
        System.out.println("Helicopter is fly");
    }
}

public class program18{
    public static void main(String[] args){
    Spacecraft s1 = new Spacecraft();
    Airplane a1 = new Airplane();
    Helicopter h1 = new Helicopter();
    s1.fly_obj();
    a1.fly_obj();
    h1.fly_obj();
}
}