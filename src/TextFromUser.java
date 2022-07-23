import java.util.Scanner;

public class TextFromUser {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = scanner.nextLine();
        System.out.println("Hi there," +name+". How old are you?");
        int age = scanner.nextInt();
        System.out.println("Oh, you are "+age+"? So young!");

    }
}
