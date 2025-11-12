import java.util.Locale;
import java.util.Scanner;

public class beecrowd1101 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        while (M > 0 && N > 0) {
            int menor = Math.min(M, N);
            int maior = Math.max(M, N);
            int soma = 0;
            while (menor <= maior) {
                System.out.print(menor + " ");
                soma += menor;
                menor++;
            }
            System.out.println("Sum=" + soma);

            M = sc.nextInt();
            N = sc.nextInt();
        }

        sc.close();
    }
}
