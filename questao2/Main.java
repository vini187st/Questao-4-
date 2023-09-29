package questao2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(12000.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);


        GeradorExtratos gerador = new GeradorExtratos();
        gerador.gerarConta(cc);
        gerador.gerarConta(cp);
    }
}
