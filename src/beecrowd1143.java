import java.util.Scanner;

public class beecrowd1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int cubo = i * i;
            int quadrado = i * i * i;
            System.out.printf("%d %d %d\n", i, cubo, quadrado);
        }

        sc.close();
    }
}
