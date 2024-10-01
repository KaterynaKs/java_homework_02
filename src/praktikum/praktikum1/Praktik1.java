package praktikum.praktikum1;
import java.util.Scanner;
public class Praktik1 {
    public static void main(String[] args) {
/*Создайте метод getSum(int a, int b), который ничего не возвращает,
и печатает результат суммы двух полученных чисел в консоль.*/
        getSum(3,7);
        getReturnSum(7,9);
    }
        public static void getSum(int a, int b) {
            System.out.println(a + b);
        }
/*Создайте метод getReturnSum(int a, int b),
который возвращает результат - сумма двух чисел, а печать в консоль производит вызывающий метод */
        public static int getReturnSum(int a, int b) {
            return a + b;
        }
    }

