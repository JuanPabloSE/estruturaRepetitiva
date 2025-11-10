import java.util.Locale;
import java.util.Scanner;

public class beecrowd1070 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // quantidade de casos de teste
        int contador = 1;     // começa no 1 (poderia ser 0 também)

        while (contador <= N) {
            float nota1 = sc.nextFloat();
            float nota2 = sc.nextFloat();
            float nota3 = sc.nextFloat();

            float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

            System.out.printf("%.1f\n", media);

            contador++; // avança o contador
        }

        sc.close();
    }
}