import java.util.Scanner;

public class beecrowd1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();


        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (i % X == 0) {                           // SE (i) for MULTIPLO de (X) - Completou as linhas, hora de pular.
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
            }

        sc.close();
    }
}
