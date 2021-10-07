import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CupOrders {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository(10);

        int option;
        do {
            System.out.println("--------------------Cup Orders--------------------");
            System.out.println("1 - dodaj zamówienie");
            System.out.println("2 - wszystkie zamówienia");
            System.out.println("3 - koniec zamówienia");

            Scanner scanner = new Scanner(System.in, "UTF-8");
//        nie rozumiem tego poniżej
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Imię: ");
                    String name = scanner.nextLine();

                    System.out.println("Tekst: ");
                    String text = scanner.nextLine();

                    System.out.println("Ilość: ");
                    int quantity = scanner.nextInt();

                    Order order = new Order(name, text, quantity);

                    orderRepository.add(order);

                    break;
                case 2:
                    orderRepository.displayAll();
                    break;
                case 3:
                    break;
            }


        } while (option != 3);
    }
}
