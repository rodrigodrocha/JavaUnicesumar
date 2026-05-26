
import java.io.Serializable;

public class Ex01_Contato implements Serializable {
    
    public String nome;
    public String telefone;

    public Ex01_Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}
