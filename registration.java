import java.util.Scanner;

public class EventRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user details
        System.out.println("==== Event Registration ====");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        // Output the registered details
        System.out.println("\n--- Registration Successful ---");
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);

        scanner.close();
    }
}
