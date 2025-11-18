import java.util.Locale;
import java.util.Scanner;

public class Exemp07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = 3;
        int tabuada = 0;

        for (int i = 1; i <= 10; i++) {
            tabuada = num * i;
            System.out.printf("%d x %d = %d\n", num, i, tabuada);
        }


        sc.close();
    }
}
