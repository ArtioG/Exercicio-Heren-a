package ProjetoFuncionario;

public class ProjetoFuncionario {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Julia", 20, "feminino");
        System.out.println(p1);

        Empregado e1 = new Empregado("Ricardo", 21, "masculino", 3000, "0112");
        System.out.println(e1);
        System.out.println("Valor INSS: " + e1.valorInss());

    }
}
