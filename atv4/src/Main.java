import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de adivinhação!!");
        System.out.println("Tente Adivinhar o número de 1 a 100:");
        int n = random.nextInt(100) + 1;
        int palpite;
        int aux = 0, i = 1;

        while (aux == 0){
            System.out.print("Palpite " + i + ": ");
            palpite = scanner.nextInt();
            if (palpite == n) {
                System.out.println("Parabéns! Você acertou, o número era " + n);
                aux = 1;
            } else if (palpite < n) {
                System.out.println("O número é maior do que " + palpite);
            }else{
                System.out.println("O número é menor do que " + palpite);
            }
            i++;
        }
    }
}