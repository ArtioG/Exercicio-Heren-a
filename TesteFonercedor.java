package ProjetoEmpresa;

public class TesteFonercedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "Rua Seu Jorge, 878", "6198475148", 1500, 500);

        System.out.println(fornecedor.toString());
        System.out.println("Saldo: " + fornecedor.oberSaldo());
    }
}
