import static java.lang.System.out;
import java.util.Scanner;

public class Lab1B {
    public static void main (String args[]) {

        String message;
        Scanner scan = new Scanner(System.in);
        out.println("Enter a line of text: ");
        message = scan.nextLine();
        out.println("You entered /" + message + "/");
    }
}
