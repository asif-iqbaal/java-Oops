// Write a Java program to create an outer class called Person with an inner class Address. The Address class
//  should have a constructor that takes parameters city and state. Create an instance of Address from the Person
//   class and print the address details.

class Person{
    class Address{
        String city;
        String state;
       public Address(String city, String state){
            this.city = city;
            this.state = state;
        }
       public void displayDetails(){
        System.out.println("city" + city);
        System.out.println("state" + state);
    }
    }

   
}

public class program11{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person.Address Add = p1.new Address("Patna","Bihar");
        Add.displayDetails();
    }
}