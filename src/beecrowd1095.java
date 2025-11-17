import java.util.Scanner;

public class beecrowd1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int J = 60;
        int I = 1;

        while (J >= 0) {
            System.out.println("I="+I + " J="+J);

            J -= 5;
            I += 3;
        }

        sc.close();
    }
}
