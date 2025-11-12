import java.util.Locale;
import java.util.Scanner;

public class beecrowd1153 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}
