package homework.homework_03;

import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
//        1 уровень сложности: №1
//        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//                Например:
//        ввод - mama, papa
//        вывод - mapa

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word consisting of an even number of letters:");
        String word1 = scan.next();
        if (word1.length() % 2 != 0){
            System.out.println("Error! Enter a word consisting of an even number of letters.");
            return;
        }

        System.out.println("Enter a second word consisting of an even number of letters:");
        String word2 = scan.next();
        if (word2.length() % 2 != 0){
            System.out.println("Error! Enter a word consisting of an even number of letters.");
            return;
        }
        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        String firstHalf = word1.substring(0, word1.length()/2);
        String secondHalf = word2.substring(0, word2.length()/2);
        String result = firstHalf + secondHalf;
        System.out.println("The result of combining the first halves of two words: " + result);
        System.out.println();

    //        №3
    //Программа запрашивает у пользователя сумму в Евро для конвертации
    //Реализовать метод, который конвертирует полученную сумму в сумму в долларах США

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter dollar amount: ");
        double sum = scan1.nextDouble();
        double exchan = 1.1;
        double doll = convertEuroToDoll(sum, exchan);
        System.out.println("The euro amount " + sum + " is equivalent to the " + doll + " dollar amount.");
    }
    public static double convertEuroToDoll(double sum, double exchan){
        return sum * exchan;
    }
}
