import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char standing;
        double gpa;
        double dues;

        System.out.print("Enter your class standing: ");
        standing = keyboard.nextLine().charAt(0);

        System.out.print("Enter your gpa: ");
        gpa = keyboard.nextDouble();

        switch (standing) {
            case 'F':
            case 'f':
                dues = 150.0;
                break;
            case 'S' :
            case 's' :
                dues = gpa > 3.75 ? 75 : 120;
                break;
            case 'J' :
            case 'j' :
                dues = gpa > 3.75 ? 50 : 100;
                break;
            case 'N' :
            case 'n' :
                dues = gpa > 3.75 ? 25 : 75;
                break;
            default:
                dues = 0;
        }

        System.out.printf("Dues: %.2f", dues);
    }
}
