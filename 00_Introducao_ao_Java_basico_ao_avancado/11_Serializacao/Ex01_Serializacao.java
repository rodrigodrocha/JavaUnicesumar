import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex01_Serializacao {
    private static void serializar(List<Ex01_Contato> listaContatos) throws IOException {
        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                                                new FileOutputStream("agenda.ser")
        )) {
          outputStream.writeObject(listaContatos);
          System.out.println("Contatos serializados e salvos com sucesso!");  
        } 
    }
    //método para deserealizar e exibir contatos
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                                                new FileInputStream("agenda.ser")
        )) {
            List<Ex01_Contato> contatosLidos = (List<Ex01_Contato>) inputStream.readObject();
            for (Ex01_Contato contato : contatosLidos){
                System.out.println("Nome " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }
    public static void main(String[] args) {

        List<Ex01_Contato> listaContatos = new ArrayList<>();
        //Adicionando contatos à lista
        Ex01_Contato contato1 = new Ex01_Contato("Joao", "12346789");
        Ex01_Contato contato2 = new Ex01_Contato("Maria", "98764321");
        Ex01_Contato contato3 = new Ex01_Contato("Rodrigo", "991167093");

        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        //fazer a serialização
        try {
            serializar(listaContatos);
            deserializarContatos();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        
    }
        


}
    

