// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized
// constructor that takes name and color as parameters and initializes the instance variables. Print the values of the
// variables.
class Dog{
    String name;
    int age;

    public Dog(String name, int age){
       this.name = name;
       this.age = age;
    }
}

public class program1{
    public static void main(String[] args) {
        Dog d1 = new Dog("pug",4);
        System.out.println(d1.name + " " + d1.age);

    }
}
