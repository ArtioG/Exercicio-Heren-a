package ProjetoAnimal;

public class ProjetoAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Fenrir", 500.6);
        Peixe peixe = new Peixe("Jormungand", 1000.1, "Agua salgada");
        Cachorro cachorro = new Cachorro("Cerberus", 600.5, "Pastor Alemão");

        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(cachorro);
    }
}
