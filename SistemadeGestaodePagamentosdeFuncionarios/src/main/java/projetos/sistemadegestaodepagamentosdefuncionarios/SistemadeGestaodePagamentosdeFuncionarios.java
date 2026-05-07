package projetos.sistemadegestaodepagamentosdefuncionarios;


public class SistemadeGestaodePagamentosdeFuncionarios {

    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente("Cleber", "489.178.777.32", 4000);
        Funcionario d1 = new Desenvolvedor ("Raphael", "489.178.777.33", 4000);
        Funcionario d2 = new Desenvolvedor ("João", "123.000.000.34", 10000);
        
        //array de funcionários
        Funcionario[] lista = {g1, d1, d2};
        
        // Percorrendo a lista e imprimindo
        for (Funcionario f : lista) {
            System.out.println(f.toString());
        }
    }
}
