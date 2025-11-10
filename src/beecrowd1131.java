import java.util.Locale;
import java.util.Scanner;

public class beecrowd1131 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int vitoriasInter = 0, vitoriasGremio = 0, empate = 0;
        int novoCalculo = 1;
        int grenais = 0;

        while (novoCalculo == 1) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter == golsGremio) {
                empate++;
            } else if (golsInter > golsGremio) {
                vitoriasInter++;
            } else {
                vitoriasGremio++;
            }
            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoCalculo = sc.nextInt();
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empate);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        }
        else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        }
        else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}
