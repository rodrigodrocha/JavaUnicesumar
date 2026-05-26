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