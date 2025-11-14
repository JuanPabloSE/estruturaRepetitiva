import java.util.Locale;
import java.util.Scanner;

public class beecrowd1142 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < N; i++) {
            contador++;
            System.out.print(contador + " ");
            contador++;
            System.out.print(contador + " ");
            contador++;
            System.out.print(contador + " ");
            System.out.println("PUM");
            contador++;

        }

        sc.close();
    }
}
