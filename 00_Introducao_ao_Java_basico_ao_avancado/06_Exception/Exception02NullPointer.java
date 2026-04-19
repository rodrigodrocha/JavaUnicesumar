public class Exception02NullPointer{
    public static void main(String[] args){

        String nome = null;

        try{
            int tamanhoNome = nome.length(); // tentando acessar obejto nulo

            System.out.println("Tamanho do nome: " + tamanhoNome);

        }catch(NullPointerException e){
            System.out.println("Erro: A variável 'nome' está nula!");
        }finally{
            System.out.println("Sempre executa o bloco finally");
        }
    }
}