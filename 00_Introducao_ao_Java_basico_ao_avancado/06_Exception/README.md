# Exceptions

![alt text](image.png)

## Tratamento de Exceções

![alt text](image-1.png)

## Exemplo de NullPointerException (Objeto nulo)

![alt text](image-2.png)

## Exemplo de ArrayIndexOutOfBoundsException (Erro quando tentamos acessar um índice que não existe em nossa array)

![alt text](image-3.png)

Como vemos em nossa imagem estamos tentando acessar em nossa array o índice 5 mas a nossa array vai até o índice 2 pois ela só possui 3 elementos com os índices 0, 1, 2. A mensagem de erro será
![alt text](image-4.png)
Tradução: Índice 5 fora dos limites para o tamanho 3

# Hierarquia dos Exceptions
![alt text](image-5.png)

# Declaração de Exceçoes em métodos

Usando o ``throws``

![alt text](image-6.png)

* Quando eu utilizo o ``throws`` no método eu obrigado a quem chamar esse método a usar o ``try`` e o ``catch``. Exemplo:

