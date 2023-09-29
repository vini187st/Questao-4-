package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("<1> Cadastrar Projeto Distribuir Alimentos");
            System.out.println("<2> Cadastrar Projeto Trabalho Voluntário");
            System.out.println("<3> Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                // Entrada de dados para DistribuicaoAlimento
                // Crie um objeto DistribuicaoAlimento, valide e imprima
            } else if (opcao == 2) {
                // Entrada de dados para TrabalhoVoluntario
                // Crie um objeto TrabalhoVoluntario, valide e imprima
            }
        } while (opcao != 3);
    }
}