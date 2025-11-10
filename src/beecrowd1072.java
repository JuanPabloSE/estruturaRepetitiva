import java.util.Scanner;

public class beecrowd1072 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int contador = 1;
        int somaIn = 0, somaOut = 0;

        while (contador <= N) {
            int numeros = sc.nextInt();
            if(numeros >= 10 && numeros <= 20) {
                somaIn++;
            }
            else if(numeros < 10 || numeros > 20) {
                somaOut++;
            }
            contador++;
        }
        System.out.println(somaIn + " in");
        System.out.println(somaOut + " out");

        sc.close();
    }
}
