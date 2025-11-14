import java.util.Locale;
import java.util.Scanner;

public class beecrowd1080 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maior = sc.nextInt();
        int posicao = 1;                    // POSIÇÃO DA ENTRADA ACIMA.

        for (int i = 2; i <= 100; i++) { // (i) É A POSIÇÃO DE (X = MAIOR).
            int X = sc.nextInt();
            if(X > maior){
                maior = X;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }

}
