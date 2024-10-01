package lessons.lesson_02;

import java.util.Scanner;

public class Cat {
//    Создать объект Scanner
//    Получить от пользователя первое число
//    Получить от пользователя второе число
//    Произвести математические операции +, -, *, /
//    Вывести результат в консоль
    public static void main(String[] args) {
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        double userDouble1 = inputNumber1.nextDouble();
        Scanner inputNumber2 = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        double userDouble2 = inputNumber1.nextDouble();
        System.out.printf("Сумма чисел: %.2f + %.2f = %.2f%n", userDouble1, userDouble2, (userDouble1+userDouble2));
        System.out.println("Разница чисел: " + (userDouble1-userDouble2));
        System.out.println("Произведение чисел: " + (userDouble1*userDouble2));
        System.out.println("Частное от деления чисел: " + (userDouble1/userDouble2));
    }
}
