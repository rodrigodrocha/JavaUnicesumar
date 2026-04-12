public class CaixaGenerica<T>{
	private T coisaNaCaixa;

	public void setCoisaNaCaixa(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T getCoisaNaCaixa(){
		return this.coisaNaCaixa;
	}
	public static void main(String[] args){
	
		//Criando uma caixa para guardar Carrinhos
		CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
		caixaDeCarrinhos.setCoisaNaCaixa(new Carrinho("Hot Wheels"));

		//Criando uma caixa para guardar Bonecas
		CaixaGenerica<Boneca> caixaDeBonecas = new CaixaGenerica<>();
		caixaDeBonecas.setCoisaNaCaixa(new Boneca("Barbie"));

		//Não precisamos fazer o casting
		//pois o método pegar() retorna um carrinho e uma boneca,

		Carrinho carrinho = caixaDeCarrinhos.getCoisaNaCaixa();
		Boneca boneca = caixaDeBonecas.getCoisaNaCaixa();

		System.out.println(carrinho.getModelo());
		System.out.println(boneca.getNome());
	}
}

