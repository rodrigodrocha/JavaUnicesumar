abstract class Animal{
	public abstract void fazerSom();
}
class Cachorro extends Animal{
	@Override
	public void fazerSom(){
		System.out.println("O cachorro faz: Au Au!!");
	}
}
class Gato extends Animal{
	@Override
	public void fazerSom(){
		System.out.println("O gato faz: Miau Miau!!");
	}
}
public class TestObject03{
	public static void main(String[] args){
		//Criando objetos polimórficos
		//é instanciado pela classe pai e instancia a classe filha	
		Object meuCachorro = new Cachorro();
		Object meuGato = new Gato();

		// PARA USARMOS OS MÉTODOS PRECISAMOS REALIZAR A CONVERSÃO DO TIPO APESAR DO TIPO SER CACHORRO O NOSSO OBJETO NÃO CONSEGUE ACESSAR OS MÉTODOS DAS CLASSES
		System.out.println(meuCachorro.getClass().getName());
		System.out.println(meuGato.getClass().getSimpleName());

		//CONVERTENDE
		Cachorro objConvertido = (Cachorro) meuCachorro; //Casting Object
		objConvertido.fazerSom();

		//CONVERTENDENDO O GATO DE OUTRO MÉTODO 
		((Gato) meuGato).fazerSom(); // O gato faz miau miau!!
		//meuGato.fazerSom();
		
	}
}