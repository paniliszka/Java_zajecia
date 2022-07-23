import java.util.Scanner;

public class UberLoop {
    public static void main(String[] args) {
        /**
         * 1. pytanie o imię, nazwisko i wiek
         * 2. Loop sprawdzający czy osoba jest pełnoletnia
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("State your name");
        String name = scanner.next();
        System.out.println("Hello " + name + ". What is your surname?");
        String surname = scanner.next();
        System.out.println("How old are you " + name);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Come on in!");
            if (age < 18) {
                System.out.println("no entry");
            }
        }
    }
}
