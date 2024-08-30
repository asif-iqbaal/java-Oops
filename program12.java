// Java Inheritance: In the Java language, classes can be derived from other classes, thereby inheriting fields
//  and methods from those classes.

// Definitions: A class that is derived from another class is called a subclass (also a derived class, extended 
// class, or child class). The class from which the subclass is derived is called a superclass (also a base class
//  or a parent class).

class Animal{
    String name;
     Animal(String name){
        this.name = name;
    }

     void makeSound(){
        System.out.println("The sound of this animal is");
    }
}

class Dog extends Animal{
    
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println(name + " Bark");
    }

     void fetch() {
        System.out.println(name + " is fetching a ball");
    }
}

public class program12{
    public static void main(String[] args) {
        Dog myDog = new Dog("pug");
        myDog.makeSound();
        myDog.fetch();
    }
}