package lessons.lesson_06;

import java.util.Scanner;

public class Lesson_06 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = sc.nextInt();
//        System.out.println(num);

//        1
        int num1 = getUserIntInput();
        int num2 = getUserIntInput();
        int res = add(num1, num2);
        printSimple(res);
        printFormatResult(num1, num2, res);

        double num3 = getUserDoubleInput();
        double num4 = getUserDoubleInput();
        double res2 = add(num3, num4);
        printSimple(res2);
        printFormatResult(num3, num4, res2);
    }
    public static double getUserDoubleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double");
        double res = sc.nextDouble();
        return res;
    }
    public static int getUserIntInput() {
//        create Scanner with name sc to read data from console
        Scanner sc = new Scanner(System.in);
//      print string "Enter a number" for user
        System.out.println("Enter a number");
//        res - value from user console int input
//        nextInt() - method from class Scanner, get only int value
        int res = sc.nextInt();
//        return value from method and end of method
        return res;
//        doesn't return
//        System.out.println("Hello");
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
        public static double add ( double num1, double num2){
            return num1 + num2;
        }

        public static void printSimple ( int res){
            System.out.println(res);
        }

        public static void printSimple ( double res){
            System.out.println(res);
        }

//    public static - access modification
//    void - return value(nothing)
//    printFormatResult - method name
//    (int num1, int num2, int res) - method params. num1, num2, res - parameters
        public static void printFormatResult ( int num1, int num2, int res){
//        print format string with params (num1, num2, res)
            System.out.println(num1 + " + " + num2 + " = " + res);
        }

        public static void printFormatResult ( double num1, double num2, double res){
//        print format string with params (num1, num2, res)
            System.out.println(num1 + " + " + num2 + " = " + res);
        }
    }

