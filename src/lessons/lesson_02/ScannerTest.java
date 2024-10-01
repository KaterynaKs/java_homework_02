package lessons.lesson_02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String userInput = inputData.next();
//        System.out.println("You entered the first word - " + userInput);
//        String inputLine = inputData.nextLine();
//        System.out.println(inputLine);
//        int userNumber = inputData.nextInt();
//        System.out.println(userNumber);
        double userDouble = inputData.nextDouble();
        System.out.println(userDouble);
    }
}
