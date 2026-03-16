package ex2;

import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        double consumption;

        while (true) {
            System.out.println("Decidi se utilizzare numero interi o decimali: digita 'i' per interi e ',' per decimali:");
            choice = scanner.nextLine();
            if ("i".equals(choice) || ",".equals(choice)) {
                break;
            } else {
                System.out.println("Inserimento non riconosciuto, riprova");
            }
        }

        if ("i".equals(choice)) {
            int km = -1;
            int litres = -1;

            while (true) {
                System.out.println("Inserisci il numero di km percorsi");
                try {
                    km = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Inserimento non riconosciuto, riprova.");
                }

                if (km >= 0) {
                    break;
                } else {
                    System.out.println("Devi inserire un numero maggiore o uguale a 0.");
                }
            }

            while (true) {
                System.out.println("Inserisci il numero di litri consumati");
                try {
                    litres = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Inserimento non riconosciuto, riprova.");
                }

                if (litres > 0) {
                    break;
                } else if (litres == 0) {
                    System.out.println("Non puoi dividere per 0");
                } else {
                    System.out.println("Devi inserire un numero maggiore di 0.");
                }
            }

            consumption = (double) km / litres;
            int intConsumption = (int) Math.round(consumption);

            System.out.println("Il consumo è di: " + intConsumption + " km/litro.");


        } else {

            double km = -1;
            double litres = -1;

            while (true) {
                System.out.println("Inserisci il numero di km percorsi");
                try {
                    km = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Inserimento non riconosciuto, riprova.");
                }

                if (km >= 0) {
                    break;
                } else {
                    System.out.println("Devi inserire un numero maggiore o uguale a 0.");
                }
            }

            while (true) {
                System.out.println("Inserisci il numero di litri consumati");
                try {
                    litres = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Inserimento non riconosciuto, riprova.");
                }

                if (litres > 0) {
                    break;
                } else if (litres == 0) {
                    System.out.println("Non puoi dividere per 0");
                } else {
                    System.out.println("Devi inserire un numero maggiore di 0.");
                }
            }

            consumption = km / litres;

            System.out.println("Il consumo è di: " + consumption + " km/litro.");
        }
        ;


    }
}
