import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i = 0;
        System.out.println("Digite quantos termos de Fibonnaci serão mostrados:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] fibo = new int[n];

        for (int j = 0; j < n; j++){
            if (j == 0){
                System.out.print(i);
                fibo[j] = i;
                i += 1;
            } else if (j == 1) {
                System.out.print(", " + i);
                fibo[j] = i;
            }else {
                i = fibo[j-1] + fibo[j-2];
                System.out.print(", " + i);
                fibo[j] = i;
            }
        }
        System.out.println();
    }
}