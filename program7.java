// Write a Java program to create a class called "MathUtility" with a static method add that takes two integers 
// and returns their sum. Demonstrate the usage of this static method in the main method without creating an
// instance of "MathUtility"

class  MathUtility{
    static int add(int a, int b){
        int sum ;
        sum = a + b;
        return sum;
    }

}

public class program7{
    public static void main(String[] args) {
        int sum = MathUtility.add(5, 6);
        System.out.println("the sum of the number without creating an instance of class " + sum);
    }
}