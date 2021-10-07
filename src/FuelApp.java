import java.util.Scanner;

public class FuelApp {

    public static void main(String[] args) {
        int size = 5;
        double[] wpisyKilometrów = new double[size];
        double[] wpisyPaliwa = new double[size];

        int option;
        do {
            System.out.println("------------------ Srednie spalanie ------------------");
            System.out.println("1 - Podaj liczbę przejechanych kilometrów oraz ilość zużytego paliwa w litrach");
            System.out.println("2 - Wyświetl aktualne, średnie spalanie");
            System.out.println("3 - Zakończ program");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.nextLine();

            int i = 0;
            switch (option) {
                case 1:
                    System.out.println("Ilość km: ");
                    double kilometry = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ilość zużytego paliwa: ");
                    double paliwo = scanner.nextDouble();
                    wpisyKilometrów[i % size] = kilometry;
                    wpisyPaliwa[i % size] = paliwo;
                    i++;
                    break;
                case 2:
                    System.out.println("Srednie spalanie wynosi: " + ((suma(wpisyPaliwa) / suma(wpisyKilometrów)) * 100) + " litrów na 100 kilometrów\n");
                    break;
            }
        } while (option != 3);
    }

    static double suma(double wpisy[]) {
        double result = 0;
        for (int i = 0; i < wpisy.length && wpisy[i] != 0; i++) {
            result += wpisy[i];
        }
        return result;
    }
}

