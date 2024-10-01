package homework.homework_02;

public class Homework_2 {

public static void main(String[] args) {
// 1 уровень сложности: № 1
// Создайте строку через new - I study Basic Java!
// Распечатать пред-последний символ строки. Используем метод String.charAt().
// Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
// Вырезать строку Java c помощью метода String.substring().
// Заменить все символы “а” на “о”.
// Преобразуйте строку к верхнему регистру.
// Преобразуйте строку к нижнему регистру.

String str = new String("I study Basic Java");
int length = str.length();
	System.out.println(str);
	System.out.println(str.charAt(length-2));
	System.out.println(str.contains("Java"));
	System.out.println(str.substring(14,18));
	System.out.println(str.replace('a','o'));
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());

//	Создайте методы с математическими операциями +, -, *, /
//	Каждый метод принимает два числа в параметрах и возвращает результат
//	Вызовите все методы в main
//	Результат распечатайте в консоль

	int resultSum = sum(3, 5);
	System.out.println("Сумма двух чисел: " + resultSum);

	int resultMult = mult(5,7);
	System.out.println("Произведение двух чисел: " + resultMult);

	int resultDiff = diff(6, 5);
	System.out.println("Разность двух чисел: " + resultDiff);

	double resultDiv = div(7, 3);
	System.out.println("Частное от деления двух чисел: " + resultDiv);
}
	private static int sum(int a, int b) {
		return a+b;
	}
	private static int mult(int a, int b) {
		return a*b;
	}
	private static int diff(int a, int b) {
		return a-b;
	}
	private static double div(double a, double b) {
	if (b==0) {
		System.out.println("На ноль делить нельзя");
//		return 0;
	}
		return a/b;
	}
}

