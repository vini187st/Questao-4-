package questao2;

public class ContaCorrente implements Conta {
    private double taxaOperacao = 0.45;
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo  -= valor + taxaOperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
