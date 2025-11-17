import java.util.Scanner;

public class beecrowd1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 1;
        int J = 7;

        while (X <= 9) {

            System.out.printf("I=%d J=%d\n",X , J);
            System.out.printf("I=%d J=%d\n",X , J - 1);
            System.out.printf("I=%d J=%d\n",X , J - 2);

            X += 2;
            J += 2;
        }

        sc.close();
    }
}
