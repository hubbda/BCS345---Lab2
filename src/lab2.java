import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) throws FileNotFoundException {

        //Part 1
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

        System.out.printf("Dues: %.2f\n", dues);

        //Part 2

        int lower;
        int upper;

        System.out.print("Enter the lower-bound integer: ");
        lower = keyboard.nextInt();

        System.out.print("Enter the upper-bound integer: ");
        upper = keyboard.nextInt();

        while(lower > upper) {
            System.out.println("invalid values");

            System.out.print("Enter the lower-bound integer: ");
            lower = keyboard.nextInt();

            System.out.print("Enter the upper-bound integer: ");
            upper = keyboard.nextInt();
        }

        File file = new File("lab2data.txt");
        PrintWriter outfile = new PrintWriter(file);

        for(int i = lower; i <= upper; i++) {
            if(i % 11 == 0) {
                System.out.print(i + ",");
                outfile.print(i + ",");
            }
        }
        System.out.println("");
        outfile.close();

        Scanner infile = new Scanner(file);
        int num;
        int sum = 0;
        int count = 0;
        double average;
        infile.useDelimiter(",");
        while (infile.hasNext()) {
            num = infile.nextInt();
            sum += num;
            count++;
            System.out.print(num + " ");
        }
        average = (double)sum / count;
        System.out.printf("\n\nThe sum is %d and the average is %.2f\n", sum, average);
        infile.close();
    }
}
