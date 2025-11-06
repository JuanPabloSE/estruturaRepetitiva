import java.util.Locale;
import java.util.Scanner;

public class beecrowd1134 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int preferencia;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        do {
            preferencia = sc.nextInt();
            if (preferencia == 1) {
                alcool += 1;

            } else if (preferencia == 2) {
                gasolina += 1;

            } else if (preferencia == 3) {
                diesel += 1;
            }

        } while (preferencia != 4); // ENQUANTO (PREFERENCIA FOR DIFERENTE DE 4) == TRUE - PROGRAMA CONTINUA

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
