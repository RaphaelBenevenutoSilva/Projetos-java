package projetos.sistemadegestaodepagamentosdefuncionarios;


public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String cpf, double Salario) {
        super(nome, cpf, Salario);
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + "\n| Bônus: R$" + formatarMoeda(calcularBonus());
    }

}
