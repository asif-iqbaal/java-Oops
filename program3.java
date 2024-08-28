
// a parameterized constructor that initializes these variables with validation:

// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.
class Account {
    int accountNumber;
    int balance;

    public Account(int ac, int b){
       if(ac>0 && b>0){
        {this.accountNumber = ac;
        this.balance = b;}
    }else
    {
        System.err.println("having some issue");
    }
}
}

public class program3{
    public static void main(String[] args) {

        Account A1 = new Account(2458139,89);
        System.out.println(A1.accountNumber + " " + A1.balance);
    }
}