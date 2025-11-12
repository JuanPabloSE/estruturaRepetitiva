import java.util.Locale;
import java.util.Scanner;

public class beecrowd1132 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);
        int soma = 0;

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
            }
        System.out.println(soma);


        sc.close();
    }
}
