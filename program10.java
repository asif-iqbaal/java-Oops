// Write a Java program to create an outer class called  Computer with an inner class Processor. The Processor
//  class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
//   Create an instance of Processor from the Computer class and call the "displayDetails()" method.

public class program10{
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer.Processor processor = c1.new Processor();
        processor.displayDetails();
    }
}

class Computer{
    class Processor{
        void displayDetails(){
            System.out.println("Intel");
            System.out.println("1.3GHz");
        }
    }
}