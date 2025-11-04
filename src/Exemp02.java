import java.util.Locale;
import java.util.Scanner;

public class Exemp02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);     // Define formato de números (p.ex. separador decimal '.') - útil para printf
        Scanner sc = new Scanner(System.in); // Scanner para ler entradas do teclado (System.in)

        // VARIÁVEL  E ENTRADA
        int idade = sc.nextInt(); // Lê a primeira idade (pode ser positiva ou negativa)
        int soma = 0;             // Acumulador para somar todas as idades válidas
        int contador = 0;         // Conta quantas idades válidas foram lidas

        // ESTRUTURA REPETITIVA
        while (idade >= 0) {            // Continua enquanto a idade for >= 0 (sentinela: idade negativa termina)
            soma += idade;              // soma = soma + idade; acumula a idade atual
            contador += 1;              // incrementa número de pessoas lidas
            idade = sc.nextInt();       // lê a próxima idade (pode encerrar o loop se for negativa)
        }

        if (contador > 0){              // Se leu pelo menos uma idade válida
            double media = (double) soma / contador; // converte soma para double para divisão real
            System.out.printf("%.2f\n", media);     // imprime a média com duas casas decimais
        }
        else {                         // Se contador == 0 (primeira entrada foi negativa)
            System.out.println("Impossível calcular");
        }

        sc.close();                      // Fecha o Scanner (boa prática)
    }
}
