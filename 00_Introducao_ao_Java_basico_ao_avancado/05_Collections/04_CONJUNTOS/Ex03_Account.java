public class Ex03_Account {
	private final String number;
	private final double balance;

	public Ex03_Account(String number, double balance){
		this.number = number;
		this.balance = balance;
	}
	public String getNumber(){
		return number;
	}
	public double getBalance(){
		return balance;
	}

	@Override
	public String toString(){
		return "Account{" + "number = " + number + ", Balance = " + balance + "}";
	}
}