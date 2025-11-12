import java.util.Locale;
import java.util.Scanner;

public class beecrowd1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);
        int soma = 0;

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
