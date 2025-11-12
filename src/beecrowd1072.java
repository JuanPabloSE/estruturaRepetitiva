import java.util.Scanner;

public class beecrowd1072 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int somaIn = 0, somaOut = 0;

        for (int i = 1; i <= N; i++) {
            int X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                somaIn++;
            }
            else {
                somaOut++;
            }
        }
        System.out.println(somaIn + " in");
        System.out.println(somaOut + " out");

        sc.close();
    }
}
