import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificação:");
        i = scanner.nextInt();

        if (i % 2 == 0){
            System.out.println("é par");
        }else {
            System.out.println("é ímpar");
        }
    }
}