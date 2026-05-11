import java.util.Arrays;

public class E01_ArrayApp3{
	
	public static void main(String[] args){

	int x = 10;
	int[] y = {10};

	incrementArray(y);
	incrementArray(x);
	System.out.println("---Valor da variável não altera quando chamamos para incrementar");
	System.out.println(x);
	System.out.println("---Valor da variável da Array se altera quando chamamos para incrementar");
	System.out.println(y[0]);
	}
	private static void incrementArray(int... array){
		array[0]++;
		System.out.println(array[0]);
	}
}