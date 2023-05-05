package ProjetoEmpresa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDividida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivid) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDividida = valorDivid;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDividida() {
        return valorDividida;
    }

    public void setValorDividida(double valorDividida) {
        this.valorDividida = valorDividida;
    }

    public double oberSaldo() {
        return valorCredito - valorDividida;
    }
}
