# Exercício 01: Calculadora Funcional de Potência e Raiz
<img src="../../img/image.png"></img>

## Objetivo:
O objetivo deste exercício é criar uma calculadora funcional que execute operações matemáticas específicas.

## Instruções:
1. Defina a interface ``OperacaoMatematica``:

    * Crie uma interface chamada ``OperacaoMatematica``.

    * Essa interface deve conter um método abstrato chamado ``executar(double a, double b)``.

    * A interface ``OperacaoMatematica`` será usada para definir diferentes operações matemáticas.

2. Implemente a classe ``CalculadoraPersonalizada``:

    * Crie a classe ``CalculadoraPersonalizada``.

    * Nessa classe, você deve:

        * Criar instâncias da interface ``OperacaoMatematica`` para calcular a potência de dois números e a raiz quadrada da soma de dois números.

        * Utilizar as funções ``Math.pow(a, b)`` e ``Math.sqrt(a + b)`` para realizar os cálculos.

        * Exibir os resultados no console.

### Observações:
* Potência: A função ``Math.pow(a, b)`` eleva o número ``a`` à potência ``b``.

* Raiz quadrada: A função ``Math.sqrt(x)`` calcula a raiz quadrada do número ``x``.

## Passos para fazer o exercício:
1. Defina a interface ``OperacaoMatematica``:

    * Adicione a anotação ``@FunctionalInterface`` em sua interface.

    * A interface ``OperacaoMatematica`` deve ter um único método chamado ``executar(double a, double b)``.

    * Esse método receberá dois números (``a`` e ``b``) como parâmetros e retornará um resultado.

2. Implemente a classe ``CalculadoraPersonalizada``:

    * Na classe ``CalculadoraPersonalizada``, crie duas instâncias da interface ``OperacaoMatematica``:

        * Uma para calcular a potência de dois números usando ``Math.pow(a, b)``.

        * Outra para calcular a raiz quadrada da soma de dois números usando ``Math.sqrt(a + b)``.

    * Execute as operações com valores específicos (por exemplo, potência de 2 elevado a 3 e raiz quadrada da soma de 10 e 5).

    * Exiba os resultados no console.

# 
<img src="../../img/image.png"></img>



