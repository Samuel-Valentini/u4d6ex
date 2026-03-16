import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int l;

        while (true) {
            System.out.println("Quanto vuoi che sia lungo l'array? Solo numeri > 0");

            try {
                l = Integer.parseInt(scanner.nextLine());
                if (l <= 0) {
                    throw new NumberFormatException();
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("numero non riconosciuto, riprova");
            }


        }

        int[] array = arrayOfInt(l);
        System.out.println(Arrays.toString(array));


        firstLoop:
        while (true) {
            System.out.println("Inserisci un numero intero da inserire nell'array, premi 0 per uscire");
            int n;
            while (true) {
                try {
                    String firstInput = scanner.nextLine();
                    n = Integer.parseInt(firstInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inserimento errato, riprova.");
                }
            }

            if (n == 0) {
                break;
            }

            int p;
            while (true) {
                System.out.println("Inserisci la posizione in cui inserire il numero " + n + " precedentemente inserito, le posizioni possibili sono da 0 a" + (array.length - 1) + ": (* per uscire senza salvare)");


                while (true) {
                    String input = scanner.nextLine();
                    if (input.equals("*")) {
                        break firstLoop;
                    }
                    try {
                        p = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inserimento errato, riprova.");
                    }
                }


                try {
                    array[p] = n;
                    break;
                } catch (RuntimeException e) {
                    System.out.println("Posizione errata, riprova");
                }
            }

            System.out.println("Il nuovo array è " + Arrays.toString(array));
        }

    }

    public static int[] arrayOfInt(int n) {
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(1, 11);
        }
        return array;
    }
}
