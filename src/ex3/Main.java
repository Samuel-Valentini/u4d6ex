package ex3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto1 = new ContoCorrente("Gino", 100);


        while (true) {
            System.out.println("Quanto vuoi prelevare dal tuo conto corrente? Saldo attuale: " + conto1.restituisciSaldo());
            double prelievo = Double.parseDouble(scanner.nextLine());
            try {
                conto1.preleva(prelievo);
                System.out.println(conto1.restituisciSaldo());
            } catch (BancaException e) {
                System.out.println(e.getMessage());
                System.out.println(conto1.restituisciSaldo());
                break;
            }
        }


        ContoOnLine contoO = new ContoOnLine("Pino", 100, 50);

        while (true) {
            System.out.println("Quanto vuoi prelevare dal tuo conto online? Saldo attuale: " + contoO.restituisciSaldo());
            double prelievo = Double.parseDouble(scanner.nextLine());
            try {
                contoO.preleva(prelievo);
                System.out.println(contoO.restituisciSaldo());
            } catch (BancaException e) {
                System.out.println(e.getMessage());
                System.out.println(contoO.restituisciSaldo());
                break;
            }
        }


    }
}
