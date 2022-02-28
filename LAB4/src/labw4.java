import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class labw4 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a non-negative integer: ");
        num = sc.nextInt();

        int[] list = new int[num+10];

        Random rand = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100); // 0 to 100: including 0 and excluding 100
        }

        printArray(list);

        //5
        System.out.println("\n");
        System.out.println("The highest element in the array is: " + getHighest(list));
        System.out.println("");
        System.out.printf("The average of the array is: %.2f\n", getAverage(list));

        //4
        list[list.length-1] = list[7] - list[4];
        System.out.println("");
        printArray(list);

        //6
        int[][] array2d = {{1, 2},{3, 4, 5},{6, 7, 8, 9}};

        System.out.println("\n");
        printArray(array2d);
        System.out.println("");
        printSumofRow(array2d);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void printArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%-5d", array[row][col]);
            }
            System.out.println("");
        }
    }

    public static void printSumofRow(int[][] array) {
        for(int row = 0; row < array.length; row++) {
            int total = 0;
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
            System.out.printf("The sum at row %d is %d\n", row, total);
        }
    }

    public static int getHighest(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = (array[i] > max) ? array[i] : max;
        }
        return max;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        int total = array.length;
        for (int i = 0; i < total; i++) {
            sum += array[i];
        }
        return (double) sum / total;
    }
}
