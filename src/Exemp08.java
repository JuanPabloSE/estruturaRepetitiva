import java.util.Scanner;

public class Exemp08 {
    public static void main(String[] args) {


        int somaPares = 0;
        for (int i = 1; i <= 5; i++){
            if (i % 2 == 0){
                System.out.printf("%d é par\n", i);
                somaPares++;
            }
            else {
                System.out.printf("%d é impar\n", i);
            }
        }
        System.out.println("Total de pares: " + somaPares);


    }
}
