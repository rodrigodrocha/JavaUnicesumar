interface Veiculo {
	
	//Método abstract
	void iniciar();

	//Método default
	default void buzinar(){
		System.out.println("Buzinando!!");
	}

	//Método static
	// ❌ Não podem ser sobrescritos (override)
	// ❌ Não são herdados pelas classes que implementam a interface
    // ✅ Pertencem apenas à interface
    // ✅ Só podem ser chamados usando o nome da interface
	
	static void parar(){
		System.out.println("O veículo esta parando");
	}

}

class Carro implements Veiculo {
	public void iniciar(){
		System.out.println("O carro ligou!!");
	}

}

class Caminhao implements Veiculo {
	public void iniciar(){
		System.out.println("O caminhão ligou!!");
	}
}

public class Aplicacao{
	public static void main(String[] args){
	
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();

		caminhao.iniciar();
		caminhao.buzinar();
		//não podemos chamar a classe parar pela classe caminhão pois o caminhão não herdou ela todas as classes static de uma interface não são herdadas quando implementas por uma classe
		Veiculo.parar();
	}	
}
