import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EX04_Conversao_Array_em_List{
	public static void main(String[] args){

		Integer[] numbers = {1, 2, 3, 4};

		//convertendo de array para list
		List<Integer> list = Arrays.asList(numbers);
		System.out.println(list);


		//Convertendo de list para Array
		//tenho que criar o array com o tamanho necessário
		Integer[] array2 = list.toArray(new Integer[4]);
		System.out.println(Arrays.toString(array2));
	}
}