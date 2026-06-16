public class Main {
    public static void main(String[] args) {
        try {
            new Application().start();
        } catch (Exception exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}