import java.util.Locale;
import java.util.Scanner;

public class Exemp12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int par = 0;
        int impar = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X % 2 == 0){
                par++;
            }

            else {
                impar++;
            }
        }

        System.out.printf("%d pares%n", par);
        System.out.printf("%d impares%n", impar);

        sc.close();
    }
}
