import java.util.Locale;
import java.util.Scanner;

public class beecrowd1094 {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VALOR REFERENTE AOS CASOS DE TESTES A SEGUIR.
        int N = sc.nextInt();

        //
        int somaR = 0;
        int somaS = 0;
        int somaC = 0;

        // ESTRUTURA REPETITIVA.

        for (int i = 0; i < N; i++) {
            int quantidade = sc.nextInt();
            char cobaias = sc.next().charAt(0);

            if (cobaias == 'R') {
                somaR += quantidade;                    // RECEBE QUANTIDADE DE COBAIAS - R

            }
            else if (cobaias == 'S') {
                somaS += quantidade;                    // RECEBE QUANTIDADE DE COBAIAS - S

            }
            else {
                somaC += quantidade;                    // RECEBE QUANTIDADE DE COBAIAS - C

            }

        }

        // CÁLCULO
        int totalCobaias = somaR + somaS + somaC;
        double percentualC, percentualR, percentualS;
        percentualC = (double) somaC / totalCobaias * 100.00;
        percentualR = (double) somaR / totalCobaias * 100.00;
        percentualS = (double) somaS / totalCobaias * 100.00;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + somaC);
        System.out.println("Total de ratos: " + somaR);
        System.out.println("Total de sapos: " + somaS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);

        sc.close();
    }

}
