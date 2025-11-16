import java.util.Scanner;

public class beecrowd1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 0) {                                     // PROGRAMA PARA QUANDO ENTRADA FOR IGUAL (0)
            for (int i = 1; i < X; i++) {                   // IMPRIMIR A SEQUÊNCIA DE 1 ATÉ X
                System.out.print(i + " ");
            }
            System.out.println(X);

            X = sc.nextInt();
        }

        sc.close();
    }
}
