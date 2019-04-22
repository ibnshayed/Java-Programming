public class MainClass {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("Akash", "Footballer", 23);
        Cricketer cricketer = new Cricketer("Batash", "Cricketer", 22);

        System.out.print("Footballer Name: " + footballer.getName());
        footballer.display();

        System.out.print("Cricketer Name: " + cricketer.getName());
        cricketer.display();
    }
}
