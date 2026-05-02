1. A Classe Pessoa (O Objeto de Dados)
Esta é a base do seu programa. Ela define o que é uma "Pessoa" dentro do sistema.

Atributos: Você definiu nome e idade para armazenar as informações básicas.

Construtor: O método public Pessoa(String nome, int idade) é usado para criar o objeto já preenchido.

Método mostrar(): Você utilizou o System.out.printf. O código %-20s reserva 20 espaços para o nome e o alinha à esquerda, garantindo que a lista fique organizada em colunas quando você imprimir várias pessoas.

2. A Classe Cadastro (A Lógica de Gerenciamento)
Esta classe funciona como o "banco de dados" temporário do programa, utilizando um ArrayList.

Ordenação (Método listar): Você adicionou uma lógica avançada usando Comparator.comparing. O uso do .toLowerCase() dentro do comparador é excelente, pois evita que nomes com letras maiúsculas e minúsculas fiquem fora de ordem alfabética.

Busca e Remoção: Ambos os métodos (buscar e remover) utilizam um loop for (Pessoa p : lista). Esse é o "for-each", que percorre cada item da lista. O uso de equalsIgnoreCase permite que o usuário encontre "Ana" mesmo digitando "ana".

3. A Classe CadastroPOO (O Menu e Interação)
Aqui é onde o programa "ganha vida" e interage com o usuário.

Tratamento de Erros (try-catch): Na leitura da opção do menu, o seu bloco try-catch evita que o programa feche se o usuário digitar uma letra em vez de um número. Isso é uma ótima prática de robustez.

Limpeza de Buffer (sc.nextLine()): Note que você usou sc.nextLine() logo após sc.nextInt(). Isso é essencial em Java para "limpar" o Enter que sobra no teclado, evitando que a próxima leitura de texto (como o nome) seja pulada.

Recursividade Visual: Nos casos de busca (3) e remoção (4), você utilizou um while (!encontrado) ou while (!removido). Isso cria uma experiência melhor, pois obriga o usuário a tentar novamente ou digitar "0" para sair, sem precisar voltar ao menu principal toda hora.
