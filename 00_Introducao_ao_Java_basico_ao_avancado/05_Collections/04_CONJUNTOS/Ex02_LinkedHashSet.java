import java.util.LinkedHashSet;
import java.util.Set;

public class Ex02_LinkedHashSet{
	public static void main(String[] args){

		Set<String> set = new LinkedHashSet<>();
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