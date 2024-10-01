package lessons.lesson_06;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
//        int randNum = rand.nextInt();
//        int randNum1 = rand.nextInt(10);
//        int randNum2 = rand.nextInt(10,100);
//
//        System.out.println("randNum "+ randNum);
//        System.out.println("randNum1 "+ randNum1);
//        System.out.println("randNum2 "+ randNum2);

//        double doubleNum1 = rand.nextDouble();
//        double doubleNum2 = rand.nextDouble(10);
//        double doubleNum3 = rand.nextDouble(10,100);
//
//        System.out.println("doubleNum1 "+ doubleNum1);
//        System.out.println("doubleNum2 "+ doubleNum2);
//        System.out.println("doubleNum3 "+ doubleNum3);
//        System.out.printf("doubleNum " + doubleNum3,(2));

        double num = Math.random(); // from 0 to 1
        System.out.println("num  " + num);
        int minVal = 10;
        int maxVal = 50;
        int randValue = (int)(Math.random() * (maxVal - minVal) + minVal);
        System.out.println("randValue = " + randValue);
    }
}
