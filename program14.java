//  Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called
//   Rectangle that overrides the getArea() method to calculate the area of a rectangle.

public class program14{
    public static void main(String[] args){

        Rectangle r1 = new  Rectangle(5,6);
       System.out.println("The area of Rectangle is "+ r1.getArea());

    }
}

class Shape{

    public int getArea(){
        return 0;
    }
}

class Rectangle extends Shape{
    int num1;
    int num2;
   
   public  Rectangle(int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
   }
   @Override
   public int getArea(){
    return num1 * num2;
   }
}