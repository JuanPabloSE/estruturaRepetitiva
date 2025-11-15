import java.util.Locale;
import java.util.Scanner;

public class beecrowd1144 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int cubo = i * i;
            int quadrado = i * i * i;
            System.out.printf("%d %d %d\n", i, cubo, quadrado);
            System.out.printf("%d %d %d\n", i, cubo + 1, quadrado + 1);

        }

        sc.close();
    }
}
