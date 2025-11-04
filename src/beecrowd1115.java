import java.util.Locale;
import java.util.Scanner;

public class beecrowd1115 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA - VARIÁVEIS
        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0){
            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            else if (X < 0 && Y > 0){
                System.out.println("segundo");
            }
            else if (X < 0 && Y < 0){
                System.out.println("terceiro");
            }
            else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}
