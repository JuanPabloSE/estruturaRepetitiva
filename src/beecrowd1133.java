import java.util.Scanner;

public class beecrowd1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int menor = Math.min(X, Y) + 1;
        int maior = Math.max(X, Y);

        while (menor < maior) {
            if (menor % 5 == 3 || menor % 5 == 2) {
                System.out.println(menor);
            }

            menor++;
        }



        sc.close();
    }
}
