import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03_MainSetEntendendoMetodos{
	public static void main(String[] args){

		Ex03_Account a1 = new Ex03_Account("123", 100);
		Ex03_Account a2 = new Ex03_Account("456", 200);

		// .of é igual o .of da lista, mas nesse caso ele criar um Set imutável
		var accounts = Set.of(a1, a2);

		//INTERAÇÃO DO SET
		for (Ex03_Account account : accounts){
			System.out.println(account);
		}
	}
}