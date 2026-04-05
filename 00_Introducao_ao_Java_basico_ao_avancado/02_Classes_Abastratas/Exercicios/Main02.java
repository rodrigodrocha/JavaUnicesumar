abstract class Loja {
	private String cnpj;
	private String razaoSocial;
	protected boolean aberta;

	//Construtor
	public Loja(String cnpj, String razaoSocial){
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}

	public void abrir(){
		this.aberta = true;
	}
	public void fechar(){
		this.aberta = false;
	}
}

class LojaComercial extends Loja {
	public LojaComercial(String cnpj, String razaoSocial){
	super(cnpj, razaoSocial);
	}	
}

public class Main02{
	public static void main(String[] args){
		LojaComercial minhaLoja = new LojaComercial("123456789", "Minha Loja");
		minhaLoja.abrir();
		System.out.println("Abrindo a loja " + minhaLoja.aberta);
		minhaLoja.fechar();
		System.out.println("Fechando a loja " + minhaLoja.aberta);
	}
}