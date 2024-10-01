package praktikum.praktikum1;
import java.util.Random;

public class Praktik2 {
    public static void main(String[] args) {
//        Использование Random класса:
//        Импортировать класс java.util.Random
//        Создать экземпляр класса Random (Random rand = new Random())
//        Вызовите один из следующих методов объекта rand:
//        nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
//        nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
//        nextDouble() генерирует двойное число между 0.0 и 1.0.
        Random rand = new Random();
        int num1 = rand.nextInt();
        float num2 = rand.nextFloat(0,1);
        double num3 = rand.nextDouble(0,1);
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
        System.out.println("num3 " + num3);



//        Использование Math.random
//
//        Объявить минимальное значение диапазона
//        Объявить максимальное значение диапазона
//        Используйте формулу Math.random()*(max-min+1)+min для создания значений, включающих значение min и max

        int minVal = 10;
        int maxVal = 15;
        int randValue = (int)(Math.random() * (maxVal - minVal) + minVal);
        System.out.println("randValue = " + randValue);
    }
}
