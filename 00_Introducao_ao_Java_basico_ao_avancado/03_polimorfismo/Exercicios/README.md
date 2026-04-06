# Exercício 01 : Gerenciador de Veículos Polimórficos

### Objetivo
O objetivo deste exercício é demonstrar o uso de polimorfismo em uma hierarquia de classes relacionadas a veículos.

### Instruções
Passos para fazer o exercício:

1. Definir a classe abstrata ``Veiculo``:

    * A classe ``Veiculo`` é abstrata, o que significa que não pode ser instanciada diretamente. Ela serve como um modelo para outras classes derivadas.

    * Ela possui dois atributos privados: ``placa`` (String) e ``ano`` (int).

    * O construtor da classe ``Veiculo`` recebe esses dois parâmetros e inicializa os atributos.

    * A classe ``Veiculo`` também possui um método chamado ``exibirInformacoes()``, que imprime a ``placa`` e o ``ano`` do veículo.

2. Criar as classes derivadas ``Onibus`` e ``Caminhao``:

    * Ambas as classes herdam da classe ``Veiculo``.

    * A classe ``Onibus`` possui um atributo adicional chamado ``assentos`` (int).

    * A classe ``Caminhao`` possui um atributo adicional chamado ``eixos`` (int).

    * Os construtores das classes derivadas chamam o construtor da classe base (``Veiculo``) usando ``super(placa, ano)``.

    * Cada classe derivada sobrescreve o método ``exibirInformacoes()`` para incluir informações específicas (``assentos`` para ônibus e ``eixos`` para caminhões).

3. Classe GerenciadorVeiculos:

    * Essa classe contém o método ``main``, que é o ponto de entrada do programa.

    * No método ``main``, você cria instâncias de ``Onibus`` e ``Caminhao`` com valores específicos para ``placa``, ``ano``, ``assentos`` e ``eixos``.

    * Em seguida, você chama o método ``exibirInformacoes()`` para mostrar os detalhes de cada veículo.

Lembre-se de que, como a classe ``Veiculo`` é abstrata, você não pode criar um objeto diretamente dela. Use as classes derivadas (``Onibus`` e ``Caminhao``) para instanciar veículos específicos e exibir suas informações.



### Solução do Exercício
Você pode baixar esta e outras soluções dos exercícios (com explicações) ao final desta seção.





# Exercício 2: Calculadora Polimórfica

### Objetivo:
O objetivo deste exercício é criar uma calculadora polimórfica em Java que pode realizar operações de adição, subtração, multiplicação e divisão.

### Instruções
1. Crie uma classe abstrata chamada Operacao com um método abstrato calcular.

2. Implemente a classe Operacao em quatro classes concretas: Soma, Subtracao, Multiplicacao e Divisao.

3. Crie uma classe chamada Calculadora com o método main para testar as implementações das operações matemáticas.

4. Compile e execute o programa para verificar os resultados.

### Passos para Fazer o Exercício
1. Criação da Classe Abstrata ``Operacao``:
    * Defina a classe abstrata ``Operacao`` com o método abstrato ``calcular`` que recebe dois parâmetros do tipo ``double``.

2. Implementação das Classes Concretas:
    * Crie a classe ``Soma`` que estende ``Operacao`` e implemente o método ``calcular`` para realizar a soma.
    * Crie a classe ``Subtracao`` que estende ``Operacao`` e implemente o método ``calcular`` para realizar a subtração.
    * Crie a classe ``Multiplicacao`` que estende ``Operacao`` e implemente o método ``calcular`` para realizar a multiplicação.
    * Crie a classe ``Divisao`` que estende ``Operacao`` e implemente o método ``calcular`` para realizar a divisão, incluindo uma verificação para divisão por zero.

3. Criação da Classe ``Calculadora``:
    * Defina a classe ``Calculadora``.
    * No método ``main``, crie instâncias de ``Soma``, ``Subtracao``, ``Multiplicacao`` e ``Divisao``.
    * Chame o método ``calcular`` para cada operação com valores de exemplo.
    * Imprima os resultados no console.

4. Compilação e Execução:
    * Compile o código utilizando um compilador Java.
    * Execute o programa e verifique os resultados impressos no console.



### Solução do Exercício


