package ProjetoEmpresa;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador("João", "Rua A, 123", "1111-1111", 35, 5000.0, 0.2, 1);
        System.out.println(adm);
        System.out.println("Salario: " + adm.cacularSalario());
    }
}
