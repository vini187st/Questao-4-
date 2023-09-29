package questao3;
import java.util.Scanner;

class ProjetoSocial {
    String nomProjeto;
    String descricao;
    String datainicio;
    String datafim;

    public ProjetoSocial(String nomProjeto, String descricao, String datainicio, String datafim) {
        this.nomProjeto = nomProjeto;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    // Getters e Setters

    // Método para validar Projeto
    public boolean validaProjeto() {
        // Implemente a lógica de validação aqui
        return true; // Exemplo: sempre retorna true por enquanto
    }

    // Método para imprimir Projeto
    public String imprimeProjeto() {
        // Implemente a lógica para formatar os atributos em uma String
        return ""; // Exemplo: retorna uma string vazia por enquanto
    }
}

