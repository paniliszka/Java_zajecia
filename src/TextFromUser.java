import java.util.Scanner;

public class TextFromUser {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        String userInput = scanner.nextLine();
        System.out.println("Hi there, " +userInput);

    }
}
