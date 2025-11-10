import java.util.Locale;
import java.util.Scanner;

public class beecrowd1078 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int contador = 1;
        int resultado = 0;

        while (contador <= 10) {
            resultado = contador * N;
            System.out.println(contador + " x " + N + " = " + resultado);
            contador++;
        }


        sc.close();
    }
}
