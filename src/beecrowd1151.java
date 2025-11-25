import java.util.Scanner;

public class beecrowd1151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0;   // F(0)
        int b = 1;   // F(1)
        int c;

        if (N >= 1) {
            System.out.print(a);   // imprime o primeiro valor sem espaço antes
        }

        if (N >= 2) {
            System.out.print(" " + b);  // imprime o segundo com espaço antes
        }

        for (int i = 3; i <= N; i++) {
            c = a + b;   // F(n) = F(n−1) + F(n−2)

            System.out.print(" " + c);

            a = b;       // atualiza F(n−2)
            b = c;       // atualiza F(n−1)
        }

        System.out.println(); // quebra de linha final
    }
}