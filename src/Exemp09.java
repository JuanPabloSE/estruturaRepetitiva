public class Exemp09 {
    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            System.out.printf(i + " ");
            if (i % 2 == 0 && i != 10){
                System.out.println("- Par encontrado!");
                break;
            }
        }
    }
}
