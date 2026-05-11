import java.util.Arrays;

public class E01_ArrayApp2{
	
	public static void main(String[] args){

		int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};

		//interação do array com for
		for (int i = 0; i < primeNumbers.length; i++){
			System.out.format("=> %s\n", primeNumbers[i]);
		}
	}
}