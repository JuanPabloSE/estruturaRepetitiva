import java.util.Scanner;

public class beecrowd1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int I = 1;
        int J = 7;

        while (I <= 9) {
            System.out.printf("I=%d J=%d\n",I , J);
            System.out.printf("I=%d J=%d\n",I , J - 1);
            System.out.printf("I=%d J=%d\n",I , J - 2);

            I = I + 2;
        }


        sc.close();
    }
}
