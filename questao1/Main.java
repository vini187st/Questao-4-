package questao1;

public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2021);
        cp.imprimeExtrato();
    }
}
