// Write a Java program to create a class called Classroom with instance variables className and students 
// (an array of strings). Implement a parameterized constructor that initializes these variables. Print the
// values of the variables.


class Classroom{
     String className ;
     String[] students;

    public Classroom(String className, String[] students){
        this.className = className;
        this.students = students;
    }
    public void print(){
        System.out.println(className);

        for(String student : students){
            System.out.println(student);
        }
    }
}


public class program5{

    public static void main(String[] args) {
      String[] students = {"shami","asif","iqbaal"};
      Classroom c1 = new Classroom("class 4 A",students);
      c1.print();
    }
}