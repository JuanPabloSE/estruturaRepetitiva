import java.util.Locale;
import java.util.Scanner;

public class beecrowd1114 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL E ENTRADA
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        if (senha == 2002){
            System.out.println("Acesso permitido");
        }

        sc.close();
    }
}
