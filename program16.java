// In Java, abstraction is not necessarily always defined with an empty method body. When defining abstraction through abstract methods or interface methods, these methods are indeed defined without a body, meaning they don’t have any
// implementation. This is because they are meant to be implemented by subclasses or classes that implement the 
// interface.
// abstract methods cannot have a body. If you need a method to have a body, it should not be abstract.
// You can define it as a regular method in an abstract class.
// while abstraction often involves defining methods without bodies, this is not always the case. It depends on whether
// you're defining an abstract method (which cannot have a body) or using newer Java features like default methods in
// interfaces.


// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses
// Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on
// their specific behavior.

abstract class Animal{
   public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Lion is Sleeping");
    }
}
class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Tiger is Sleeping");
    }
}
class Deer extends Animal{
    @Override
    public void eat(){
        System.out.println("Deer is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Deer is Sleeping");
    }
}
public class program16{
    public static void main(String[] args) {
        
        Lion o1 = new Lion();
        Tiger o2 = new Tiger();
        Deer o3 = new Deer();
        o1.eat();
        o1.sleep();
        o2.eat();
        o2.sleep();
        o3.eat();
        o3.sleep();
    }
}

