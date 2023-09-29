package questao3;
class DistribuicaoAlimento extends ProjetoSocial {
    String descAlimento;
    int qtde;

    public DistribuicaoAlimento(String nomProjeto, String descricao, String datainicio, String datafim, String descAlimento, int qtde) {
        super(nomProjeto, descricao, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    // Getters e Setters

    // Método para validar Projeto específico para DistribuicaoAlimento
    public boolean validaProjeto() {
        if (this.datafim.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Método para imprimir Projeto específico para DistribuicaoAlimento
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomProjeto + "\nDescrição: " + descricao + "\nData de Início: " + datainicio +
                "\nData de Fim: " + datafim + "\nDescrição do Alimento: " + descAlimento + "\nQuantidade: " + qtde;
    }
}