import java.util.Locale;
import java.util.Scanner;

public class beecrowd1150 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z = sc.nextInt();
        int i = 1;
        int valor = X;

        while (Z <= X) {
            Z = sc.nextInt();
        }

        for (i = 1; X <= Z; i++) {
            X += valor + i;
        }

        System.out.println(i);

        sc.close();
    }

}
