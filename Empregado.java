package ProjetoFuncionario;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() + "[, Salario:  " + salario + ", Matricula: ]" + matricula;
    }
}
