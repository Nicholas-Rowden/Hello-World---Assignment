import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Please type \"Hello World!\" for the sake of the assignment.");
        System.out.print("Please enter the phrase you'd like to say: ");

        // Read the user's input
        String phrase = scan.nextLine();

        // Echo the user's input with added context
        System.out.println("You said: " + phrase);

        // Close the Scanner to free up resources
        scan.close();
    }
}
