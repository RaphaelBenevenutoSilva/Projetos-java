package projetos.sistemadegestaodepagamentosdefuncionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double Salario) {
        super(nome, cpf, Salario);
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + "\n| Bônus: R$ " + formatarMoeda(calcularBonus());
    }

}
 
/*Herança:não precisou escrever private String nome em todas as classes.
O Gerente já "nasce" com tudo o que o Funcionario tem
*/
