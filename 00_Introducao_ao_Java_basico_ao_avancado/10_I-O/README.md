# Trabalhando com I/O (ai/ou)

![alt text](image.png)

## Trabalhando com a biblioteca Path
![alt text](image-2.png)

### Aprendendo a Encadear caminho 
![alt text](image-3.png)

## Trabalhando com a biblioteca Files
![alt text](image-1.png)


## Criando diretório

Temos que ter cuidado quando executamos o código pois se o diretório existir pode gerar erro vamos ao exemplo:
* Quando criamos rodamos pela primeira vez o código criando um diretório e ele não existir rodara normalmente e criando o diretório:
![alt text](image-4.png)
* se tentarmos rodar de novo o diretório gerará um erro, pois o diretório ja existe:
![alt text](image-5.png)

Analisando o erro podemos ver que ele informa que o arquivo já existe
![alt text](image-6.png)

### Criação de arquivos e diretórios temporários
![alt text](image-7.png)


## Copiando e movendo arquivos
![alt text](image-8.png)


## percorrendo os conteúdos dentro de um caminho.
![alt text](image-9.png)

### arquivos específicos
![alt text](image-10.png)


# Exercício 1 
![alt text](image-11.png)
## Resolução 
![alt text](image-12.png)


# Exercício 2
![alt text](image-13.png)
## Resolução
![alt text](image-14.png)
Rodei o código de novo e criou um novo arquivo 
![alt text](image-15.png)


# Escrevendo Arquivos com FileWrite e lendo com FileReader
![alt text](image-16.png)

## criando dentro de uma pasta 
![alt text](image-17.png)

# Java NIO
![alt text](image-18.png)

## Escrevendo e lendo usando o NIO
![alt text](image-19.png)


# FileInputStream, FileOutputStream, OutputStream e InputStream
Conseguimos ler os arquivos e gerar uma copia com essas quatro classes
 eles retornam bytes na leitura e escrevem com bytes, mas no momento da escrita já converte para caracteres os bytes 
 muito bom é rápido

## metódo read() do InputStream

![alt text](image-21.png)

![alt text](image-20.png)
Podemos observar que se passarmos só o buffer como parametro ele chamara o método .read() com um parametro mas retorna para o método .read() com 3 parametros, então se por padrão quisermos começar do momento zero até o final do array de bytes, podemos passar somente o array de bytes que também funcionará. Exemplo:
![alt text](image-22.png)

Podemos ver que o método .read(), retornar o número total de bytes ou -1 se não tiver mais bytes. como na figura abaixo
![alt text](image-23.png)

## transferindo bytes

![alt text](image-25.png)

Classe

![alt text](image-26.png)

## lendo apartir de uma array de bytes 
![alt text](image-27.png)

## Escrevendo uma array de bytes
![alt text](image-28.png)

#  PrintWriter
O PrintWriter é uma classe usada para escrever texto em arquivos, consoles ou outros fluxos de saída em Java.

Ele é muito utilizado porque permite escrever dados de forma simples usando métodos como:

``` java
print()
println()
printf()

``` 
✅ Exemplo básico

``` java
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        PrintWriter escritor = new PrintWriter("arquivo.txt");

        escritor.println("Olá mundo!");
        escritor.println("Java é incrível!");

        escritor.close();
    }
}
``` 
### 🧠 Por que precisamos usar ``.close()``?

Quando escrevemos em um arquivo, o Java normalmente não grava imediatamente no disco.

Ele usa um espaço temporário na memória chamado: **buffer**

Os dados ficam acumulados ali para melhorar desempenho. O método: ``close()`` faz 3 coisas importantes:

- força a escrita final no arquivo;
- libera recursos da memória;
- fecha o arquivo corretamente.

Sem o ``close()``, pode acontecer:

- arquivo vazio;
- texto incompleto;
- desperdício de memória;
- erro de acesso ao arquivo.

### ✅ O que é .flush()?

O método **flush()** serve para:

- enviar imediatamente os dados do buffer para o arquivo

MAS…

- ⚠️ ele NÃO fecha o arquivo.

#### ✅ Diferença entre flush() e close()
| Método | O que faz |
|:-------|:----------|
|flush() |Escreve os dados pendentes|
|close() |Escreve os dados + fecha o recurso|

#### ✅ Exemplo com flush()

``` java
PrintWriter escritor = new PrintWriter("arquivo.txt");

escritor.println("Linha 1");

escritor.flush(); // força gravação

escritor.println("Linha 2");

escritor.close();
``` 

#### 🚀 Forma moderna: try-with-resources

Java criou uma forma MUITO melhor de trabalhar com arquivos: ``try-with-resources``

Ela fecha automaticamente os recursos no final.

##### ✅ Exemplo

``` java
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        try (PrintWriter escritor = new PrintWriter("arquivo.txt")) {

            escritor.println("Olá!");
            escritor.println("Fechamento automático!");

        }
    }
}
```
##### 🧠 O que acontece aqui?

Quando o bloco ``try`` termina: ``}``

o Java automaticamente executa: ``escritor.close();``, mesmo se ocorrer erro.