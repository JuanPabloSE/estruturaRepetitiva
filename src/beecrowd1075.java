import java.util.Locale;
import java.util.Scanner;

public class beecrowd1075 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int contador = 1;

        while (contador <= 10000) {
            if (contador % N == 2){
                System.out.println(contador);
            }
            contador++;
        }

        sc.close();
    }
}
