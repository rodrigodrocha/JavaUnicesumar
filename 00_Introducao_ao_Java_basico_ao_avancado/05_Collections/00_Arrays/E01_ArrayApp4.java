import java.util.Arrays;

public class E01_ArrayApp4{
	public static void main(String[] args){

		//Criando array multidimensional
		int[][] array = new int[3][2];

		array[0][1] = 9;
		array[2][0] = 8;

		//interação da array multidimensional
		// array.length mostra o tamanho do primeiro elemento que é a linha 
		for(int i = 0; i < array.length; i++){
			//array[0].length mostra o tamanho de colunas que a linha possui
			// exemplo vamos interar a primeira linha 0 nela temos duas posição quando terminar de interar 

			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + " ");
			}
			// essa impressão é necessária para pular a linha
			System.out.println();
		}
	}
}