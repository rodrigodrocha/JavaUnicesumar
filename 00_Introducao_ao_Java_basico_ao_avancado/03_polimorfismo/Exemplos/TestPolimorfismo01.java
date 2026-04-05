//Super Classe
abstract class Animal{
	//quando o método é abstract obrigatoriamente preciso subescrever esses métodos nas classes filhas
	public abstract void fazerSom();
	// método SEM ABSTRACT então não é necessario subescrever!!
	public void tipoObjeto(){
		System.out.println("Objeto do tipo animal");
	}
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
public class TestPolimorfismo01{
	public static void main(String[] args){
		//Criando objetos polimórficos
		//é instanciado pela classe pai e instancia a classe filha	
		Animal meuCachorro = new Cachorro();
		Animal meuGato = new Gato();

		meuCachorro.fazerSom();
		meuGato.fazerSom();
		meuCachorro.tipoObjeto();
		meuGato.tipoObjeto();
	}
}