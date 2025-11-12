import java.util.Locale;
import java.util.Scanner;

public class beecrowd1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();
            float mediaFinal = (n1 * 2.0f + n2 * 3.0f + n3 * 5.0f) / (2.0f + 3.0f + 5.0f);
            System.out.printf("%.1f%n", mediaFinal);

        }

        sc.close();
    }
}
