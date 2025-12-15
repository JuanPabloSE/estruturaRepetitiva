import java.util.Locale;
import java.util.Scanner;

public class Exemp14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int somaIn = 0, somaOut = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                somaIn++;
            }

            else {
                somaOut++;
            }

        }

        System.out.printf("%d in%n", somaIn);
        System.out.printf("%d out%n", somaOut);

        sc.close();
    }
}
