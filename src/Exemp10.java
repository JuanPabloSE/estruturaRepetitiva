import java.util.Scanner;

public class Exemp10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maior = N;
        int menor = N;

        while (N >= 0) {
            if (N > maior) {
                maior = N;
            }
            else if (N < menor) {
                menor = N;
            }
            N = sc.nextInt();
        }

        sc.close();
    }
}
