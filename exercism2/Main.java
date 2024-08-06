package exercism2;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valor de x: ");
        int x = scanner.nextInt();
        System.out.println("Digite valor de y: ");
        int y = scanner.nextInt();

        Mdc mdc = new Mdc(x, y);

        int resultado = mdc.calcular();
        System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);
        scanner.close();
    }
}