import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos números deseja calcular a média?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double aux, soma = 0;
        double media;
        double[] num = new double[n];

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            aux = scanner.nextDouble();
            num[i-1] = aux;
        }
        for (int j = 0; j < n; j++) {
            soma += num[j];
        }

        media = soma / n;

        System.out.println("A média dos números é: " + media);
    }
}