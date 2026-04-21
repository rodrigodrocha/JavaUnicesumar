# Exercício 01: Filtrando Números Ímpares em um Conjunto (Set) em Java
<img src="../../img/image.png"></img>

## Objetivo:
Criar uma expressão lambda que filtre os números ímpares de um conjunto (Set) de inteiros.

## Instruções:
Crie um conjunto (Set) de inteiros com alguns números.

Implemente uma expressão lambda que filtre apenas os números ímpares.

Mostre o resultado após a filtragem.

## Passos para fazê-lo:
1. Crie um conjunto (Set) de inteiros:

    * Declare e inicialize um conjunto (Set) de inteiros (por exemplo, Set<Integer>).

2. Implemente a expressão lambda:

   * Use o método removeIf do conjunto para aplicar a expressão lambda de filtragem.

   * A expressão lambda deve verificar se o número é ímpar (ou seja, se o resto da divisão por 2 é diferente de zero).

Dica:

``` java

Set<Integer> numeros = new HashSet<>();

// adicione elementos

numeros.removeIf( "expressão lambda aqui!" );

```

3. Exiba os números ímpares resultantes:
Após a filtragem, exiba os números ímpares presentes no conjunto.



# Exercício 02: Manipulação de Listas com Expressões Lambda
<img src="../../img/image.png"></img>

## Objetivo:
O objetivo deste exercício é praticar o uso de expressões lambda em Java para manipular listas.

## Passos para fazer o exercício
1. Criação da Lista:

   * Objetivo: Inicializar uma lista de strings e adicionar elementos a ela.

   * Instruções:

       * Use apenas o método main (se quiser pode criar mais métodos).

       * Crie uma instância de ``ArrayList`` do tipo ``String``.

       * Utilize o método ``add`` para adicionar strings à lista.

        ```java
        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("maça");
        minhaLista.add("banana");
        minhaLista.add("cereja");
        minhaLista.add("abacaxi");
        ```

   * Explicação: Aqui, estamos criando uma lista chamada ``minhaLista`` e adicionando quatro frutas a ela.

2. Remoção de Elementos:

   * Objetivo: Remover strings da lista que tenham mais de 5 caracteres.

   * Instruções:

       * Utilize o método ``removeIf`` com uma expressão lambda que verifica o comprimento das strings.

   * Código:

       * ``minhaLista.removeIf(s -> s.length() > 5);``

   * Explicação: A expressão lambda ``s -> s.length() > 5`` verifica se o comprimento da string ``s`` é maior que 5. Se for, a string é removida da lista.

3. Adição de Elemento:

   * Objetivo: Adicionar uma nova string no início da lista.

   * Instruções:

       * Utilize o método ``add`` com o índice ``0`` para inserir a string na primeira posição.

   * Código:
       * ``minhaLista.add(0, "uva");``
   
   * Explicação: A string "grape" é adicionada na posição ``0`` da lista, ou seja, no início da lista.

4. Impressão da Lista:

   * Objetivo: Iterar sobre a lista e imprimir cada elemento.

   * Instruções:
       * Utilize o método ``forEach`` com uma referência ao método ``println`` de ``System.out``.

   * Código:
       * ``minhaLista.forEach(System.out::println);``

   * Explicação: O método ``forEach`` itera sobre cada elemento da lista e imprime cada um deles no console.





