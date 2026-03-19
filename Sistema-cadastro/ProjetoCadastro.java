package projetos.projetocadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        int opcao = 0;
        
        while (opcao !=4) {
            
            System.out.println("\n1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Sair");
            
            System.out.println("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 1) {
                 
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                
                System.out.println("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                
                Usuario u = new Usuario(nome, idade);
                usuarios.add(u);
                
                System.out.println("Usuario cadastrado!");
            }
            else if (opcao == 2) {
                for (Usuario u: usuarios) {
                    System.out.println("Nome: " + u.nome + "| Idade: " + u.idade);
                }
            }
            else if (opcao == 3) {
                System.out.println("Digite o nome: ");
                String busca = scanner.nextLine();
                
                for (Usuario u : usuarios) {
                    if (u.nome.equalsIgnoreCase(busca)) {
                        System.out.println("Encontrado: " + u.nome + " | " + u.idade);
                    }
                }
            }
        }
        
        System.out.println("Sistema encerrado");
    }
}
