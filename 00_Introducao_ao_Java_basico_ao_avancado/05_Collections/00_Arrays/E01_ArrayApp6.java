import java.util.Arrays;

public class E01_ArrayApp6{
	public static void main(String[] args){
		//Criando array multidimensional com colunas diferentes em cada linha
		String[] array = new String[5];
		System.out.println(Arrays.toString(array));
		//método fill do array atribui valores para todas array
		Arrays.fill(array, "ABC");
		System.out.println(Arrays.toString(array));

		array[0] = "C";
		array[1] = "B";
		array[2] = "E";
		array[3] = "A";
		array[4] = "D";
		System.out.println(Arrays.toString(array));

		//ORDENANDO LISTA
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		//busca binária no array por binário precisa estar em ordem crescente a lista
		// retorna a posição
		int posicao = Arrays.binarySearch(array, "C");
		System.out.println(posicao);

		//Copiando arrays .copyOf()
		String[] array2 = Arrays.copyOf(array, 10); // retorna o array com um novo tamanho maior
		System.out.println(Arrays.toString(array2));

	}
}