import java.util.Scanner;

public class beecrowd1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int X = sc.nextInt();
            int Y = sc.nextInt();

            int soma = 0;

            if (X % 2 == 0) {
                X++;
            }
            for (int j = 1; j <= Y; j++) {
                    soma += X;
                    X += 2;
            }
            System.out.println(soma);
        }

            sc.close();


    }
}