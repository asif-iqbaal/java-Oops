// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a
//  subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee{
    String work;
    int sal;

    public  Employee(int sal){
        this.sal = sal;
    }
    public void work(String work){
        this.work = work;
    }

    int getSalary(){
       return  this.sal;
    }
}

class HRManager extends Employee{
    
    
   public HRManager(int sal){
        super(sal);
    }
    public void work(){
            System.out.println("Manager works");
    }
    void addEmployee(String name){
        System.out.println("new employee added:" + name);
    }
}

public class program13{
    public static void main(String[] args) {
       HRManager h1 = new HRManager(1500);
       h1.work();
       h1.addEmployee("Rahul");
       System.out.println("salary is :"+ h1.getSalary());
        
    }
}