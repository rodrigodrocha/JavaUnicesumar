public class A02CheckingAccount extends A01Account {

    private double rate;

    public A02CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    double rate() {
        return 0;
    }

    
}
