import java.util.Locale;
import java.util.Scanner;

public class Exemp01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL - ENTRADA
        int x = sc.nextInt();
        int soma = 0;

        // 1 - ESTRUTURA WHILE (ENQUANTO) - LER ATÉ QUE A ENTRADA SEJA (0)
        // 2 - ENQUANTO "X" FOR DIFERENTE DE "0" - LEIA OUTRO NÚMERO INTEIRO NOVAMENTE.
        // 3 - OS VALORES DIFERENTES DE (0) ENTRAM EM SOMA PRA SOMAR OS NÚMEROS LIDOS
        // 4 - LEIA OUTRO NÚMERO INTEIRO NOVAMENTE.

        while (x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }
}

