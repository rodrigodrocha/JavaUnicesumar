

// usamos o T porque em ingles significa type
public class CaixaExemploGenerics<T> {
	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T pegar(){
		return coisaNaCaixa;
	}

	public static void main(String[] args){

		//Criando uma caixa para guardar Strings
		CaixaExemploGenerics<String> caixaDeTexto = new CaixaExemploGenerics<>();
		caixaDeTexto.guardar("Oi, mundo!");
		String texto = caixaDeTexto.pegar();
		System.out.println(texto);

		//Cirando uma caixinha de numeros
		//primitivo -> classe
		// int      -> Integer
		//long      -> Long
		CaixaExemploGenerics<Integer> caixaDeNumeros = new CaixaExemploGenerics<>();
		Integer numero = Integer.valueOf("3"); //usando a class Integer.
		caixaDeNumeros.guardar(6);
		Integer valorResgatado = caixaDeNumeros.pegar();
		System.out.println(valorResgatado);
		System.out.println(numero);
	}
}