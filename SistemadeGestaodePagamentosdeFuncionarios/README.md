# Sistema de Gestão de Pagamentos de Funcionários

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO).  
O sistema simula o gerenciamento de funcionários e calcula bônus de acordo com o cargo de cada um.

## 🚀 Funcionalidades
- Cadastro de funcionários
- Cálculo de bônus automático
- Exibição das informações dos funcionários
- Uso de polimorfismo para tratar diferentes tipos de funcionários

## 🛠 Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)

## 📚 Conceitos Aplicados

### 🔒 Encapsulamento
Os atributos da classe `Funcionario` são privados, garantindo maior segurança e controle dos dados através dos getters e setters.

### 🧬 Herança
As classes `Gerente` e `Desenvolvedor` herdam características da classe `Funcionario`, evitando repetição de código.

### 🎭 Polimorfismo
Todos os funcionários são armazenados em um único array do tipo `Funcionario`, mas cada objeto executa seu próprio cálculo de bônus.

### 📌 Classe Abstrata
A classe `Funcionario` foi criada como abstrata para servir como modelo para os outros tipos de funcionários.

## 📂 Estrutura do Projeto
```bash
Funcionario.java
Gerente.java
Desenvolvedor.java
SistemadeGestaodePagamentosdeFuncionarios.java

▶ Exemplo de Saída
Funcionario Nome = Cleber
| Salário = 4,000.00
| Bônus: R$ 800.00

👨‍💻 Autor
Raphael Benevenuto
