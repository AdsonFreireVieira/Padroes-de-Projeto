package Principal;

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de carro (popular/luxo): ");
        String tipo = scanner.nextLine().toLowerCase();

        CarroFactory factory;

        if (tipo.equals("popular")) {
            factory = new PopularFactory();
        } else if (tipo.equals("luxo")) {
            factory = new LuxoFactory();
        } else {
            throw new IllegalArgumentException("Tipo inválido.");
        }

        Carro carro = new Carro(factory);
        carro.monta();
    }
}
