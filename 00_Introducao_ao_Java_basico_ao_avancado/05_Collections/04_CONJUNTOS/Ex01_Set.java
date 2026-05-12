import java.util.HashSet;
import java.util.Set;

public class Ex01_Set{
	public static void main(String[] args){

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("E");
		set.add("I");
		set.add("O");
		set.add("U");

		//INTERAÇÃO DO SET
		for (String s : set){
			System.out.println(s);
		}
	}
}