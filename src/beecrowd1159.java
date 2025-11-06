import java.util.Locale;
import java.util.Scanner;

public class beecrowd1159 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 0) {
            if (X % 2 != 0){              // SE A ENTRADA (X) FOR IMPAR, ADICIONE +1.
                X++;
            }

            int soma = X + (X + 2) + (X + 4) + (X + 6) + (X + 8);
            System.out.println(soma);

            X = sc.nextInt();
        }


            sc.close();
    }
}