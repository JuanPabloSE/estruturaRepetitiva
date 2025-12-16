import java.util.Locale;
import java.util.Scanner;

public class beecrowd1164 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int somaDivisorProprio = 0;

            for (int divisor = 1; divisor <= X / 2; divisor++) {
                if (X % divisor == 0) {
                    somaDivisorProprio += divisor;
                }
            }

            if (somaDivisorProprio == X) {
                System.out.println(X + " eh perfeito");
            }

            else  {
                System.out.println(X + " nao eh perfeito");
            }

        }

        sc.close();
    }
}
