//Account class with a double instance variable balance and a constructor
//and deposit method that perform validation

public class Account {

    // instance variables
    private String name;
    private double balance;

    //Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name;

        //validate that the balance is greater that 0.0; if's not
        //instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    //method that deposits only a valid amount to the balance
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return name;
    }
}
