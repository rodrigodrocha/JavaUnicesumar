import java.util.Arrays;

public class E01_ArrayApp5{
	public static void main(String[] args){

		//Criando array multidimensional com colunas diferentes em cada linha
		int[][] array = new int[5][];

		//Criando o array multidimensional por linhas
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[4];
		array[3] = new int[1];
		array[4] = new int[2];

		//interação da array
		for (int[] d1: array){
			for(int d2 : d1){
				System.out.print(d2 + " ");
			}
			System.out.println();
		}
	}
}