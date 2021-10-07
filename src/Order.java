public class Order {
    String name;
    String text;
    int quantity;

    public Order(String name, String text, int quantity) {
        this.name = name;
        this.text = text;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Tekst: " + text);
        System.out.println("Ilość: " + quantity);
    }
}
