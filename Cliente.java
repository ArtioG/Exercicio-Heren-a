package ProjetoFuncionario;

public class Cliente extends Pessoa {
    private double valorDivid;
    private int anoNascim;

    public Cliente(String nome, int idade, String sexo, double valorDivid, int anoNascim) {
        super(nome, idade, sexo);
        this.valorDivid = valorDivid;
        this.anoNascim = anoNascim;
    }

    public double getValorDivid() {
        return valorDivid;
    }

    public void setValorDivid(double valorDivid) {
        this.valorDivid = valorDivid;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public String toString() {
        return super.toString() + ", Valor da divida: " + valorDivid + ", Ano de nascimento: " + anoNascim;
    }
}
