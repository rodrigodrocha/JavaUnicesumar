import java.util.Arrays;

public class E01_ArrayApp1{
	
	public static void main(String[] args){

		//criando um array do tipo primitivo int e o int[5] significa o tamanho que vai ter a array criada
		int[] n = new int[5];

		//Adicionando valores a array
		n[0] = 2;
		n[4] = 10;

		//lendo valores dentro da array
		System.out.println(n[0]);
		System.out.println(n[4]);

		// criando arrays com valores já
		var array1 = new int[] {2, 4, 6, 8, 10};

		//imprimindo na tela a impressão desse jeito mostra a onde o objeto esta salvo na memória
		System.out.println(array1);

		// para imprimos os valores da array usamo o método .toString()
		System.out.println(Arrays.toString(array1));

		//podemos simplificar a criação mas não podemos usar a variável var
		int[] array2 = {1, 3, 5, 7, 9};

		System.out.println(Arrays.toString(array2));
	}
}