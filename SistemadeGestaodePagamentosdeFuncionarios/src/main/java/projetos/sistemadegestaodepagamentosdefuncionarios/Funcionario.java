package projetos.sistemadegestaodepagamentosdefuncionarios;

import java.text.DecimalFormat;


abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }
    
    protected String formatarMoeda(double valor) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(valor);
    }
    
    public abstract double calcularBonus();

    @Override
    public String toString() {
        return "\nFuncionario " + "Nome = " + nome + "\n| CPF = " + cpf + 
                "\n| Salário = " + formatarMoeda(this.salario);
    }
    
    
    
}


/*Encapsulamento: Note que o salario é privado. 
Ninguém muda o salário diretamente sem passar por um método,
o que evita erros de lógica.

Polimorfismo: No programa principal, 
você pode ter uma lista de funcionários e chamar .calcularBonus() para todos.
O Java saberá sozinho se deve aplicar 10% ou 20% dependendo do tipo do objeto.
*/