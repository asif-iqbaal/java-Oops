
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to
// calculate salary and display information for each role.

abstract  class Employee{
    protected  String name;
    protected  double salary;
    public Employee(String name, double salary){
       this.name = name;
       this.salary = salary;
    }
    public abstract double calculateSalary(double d);
    public abstract void displayInfo();
}


class Manager extends Employee{

    public Manager(String name, double salary){
        super(name,salary);
    }
    @Override
    public double  calculateSalary(double bonus){
        salary += bonus;
       return salary ;
    }

    @Override
    public void displayInfo(){
        System.out.println("Manager name :" + name);
        System.out.println("Salary is :" + salary);
    }
}

class Programmer extends Employee{
    
    public Programmer(String name, double salary){
        super(name,salary);
    }

     @Override
    public double calculateSalary(double bonus){
        salary += bonus;
       return salary ;
    }

    @Override
    public void displayInfo(){
       System.out.println("Programmer name :" + name);
        System.out.println("Salary is :" + salary);
    }
}

public class program17{
    public static void main(String[] args) {
        Manager o1 = new Manager("Shami",340000);
        o1.displayInfo();
        System.out.println("");
        Programmer o2 = new Programmer("asif",300000);
        o2.calculateSalary(1200);
        o2.displayInfo();
    }
}