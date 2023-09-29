package questao3;
class TrabalhoVoluntario extends ProjetoSocial {
    String tipoTrabalho;
    int duracaoTrabalho;

    public TrabalhoVoluntario(String nomProjeto, String descricao, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomProjeto, descricao, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    // Getters e Setters

    // Método para validar Projeto específico para TrabalhoVoluntario
    public boolean validaProjeto() {
        if (this.duracaoTrabalho > 2) {
            return true;
        } else {
            return false;
        }
    }

    // Método para imprimir Projeto específico para TrabalhoVoluntario
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomProjeto + "\nDescrição: " + descricao + "\nData de Início: " + datainicio +
                "\nData de Fim: " + datafim + "\nTipo de Trabalho: " + tipoTrabalho + "\nDuração do Trabalho: " + duracaoTrabalho + " horas";
    }
}