// Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance
// , and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables.
//  Create several 'BankAccount' objects and print their details along with the static variables.

class BankAccount{
    String  accouuntNumber;
    int balance;
    static String bankName = "Bank-Of-Baroda";
    static double  interestRate = 12.5;

    public void getDetails(){
        System.out.println("Account Number : "+accouuntNumber);
        System.out.println("Balanca : "+balance);
        System.out.println("Bank Name : "+bankName);
        System.out.println("IntrestRate : "+interestRate);
        System.out.println("intrest money :" + balance * interestRate);
    }
}

public class program8{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accouuntNumber = "157451548fvsgfs54";
        b1.balance = 16234;
        b1.getDetails();

         BankAccount b2 = new BankAccount();
        b2.accouuntNumber = "15745154tytyiuj854";
        b2.balance = 10234;
        b2.getDetails();
    }
}