import java.util.Locale;
import java.util.Scanner;

public class beecrowd1154 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int contador = 0;

        while (idade >= 0){
            soma += idade;
            contador++; // CONTADOR + 1
            idade = sc.nextInt();
        }

        if (contador > 0){
            double media = (double) soma / contador;
            System.out.printf("%.2f\n", media);
        }

        sc.close();
    }
}
