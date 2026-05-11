public abstract class A01Account {

    private double balance;

    public A01Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void updateBalance(){
        this.balance += this.balance * rate();
    }
    abstract double rate();
}
