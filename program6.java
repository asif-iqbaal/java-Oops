
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that
// increments count every time an object is created. Print the value of count after creating several objects.

class Counter{
    static int count = 0;

    public Counter(){
        count++;
    }
    public void getCount(){
        System.out.println("count is "
        + count);
    }
}
public class program6{

public static void main(String[] args){
    Counter c1 = new Counter();
    //Counter c2 = new Counter();
    c1.getCount();
    //c2.getCount();
}
}