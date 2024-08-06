package exercism4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero decimal: ");
        int numeroDecimal = scanner.nextInt();

        String resultadoBinario = conversor.converterDecimalParaBinario(numeroDecimal);
        System.out.println("Representação binária de " + numeroDecimal + ": " + resultadoBinario);
        scanner.close();
    }
}
