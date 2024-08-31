// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//  Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
//   account balance falls below one hundred.

public class program15 {

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.deposit(1600);
        
        s1.withdraw(500);
        s1.withdraw(1000);
       
        s1.withdraw(20);
         s1.balance();
    }
}

class BankAccount {

    int deposit;
    int balance;
    int withdraw;

    public void deposit(int d) {
        this.deposit = d;
        balance += d;
    }
    public int withdraw(int cash){
        balance -= cash;
        return  this.withdraw = cash;
    }
    public void balance(){
        System.out.println("your current balance is : " + this.balance);
    }
}

class SavingsAccount extends BankAccount{
    
    @Override
    public int withdraw(int num){
        
        if(num<100){
            System.out.println("low money cannot withdraw money");
            return 0;
        }else{
            return  super.withdraw(num);
        }
      
    }
}