import java.util.Locale;
import java.util.Scanner;

public class beecrowd1165 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            boolean ehPrimo = true;
            for (int j = 2; j <= Math.sqrt(X); j++) {
                if (X % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo == true) {
                System.out.println(X + " eh primo");
            }
            else {
                System.out.println(X + " nao eh primo");
            }
        }

            sc.close();

    }
}