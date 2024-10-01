package lessons.lesson_04;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 10;
        double avg = getAvg(a, b, c);
        System.out.println("avg = " + avg);

        avg = getAvg(17, 23, 30);
        System.out.println("avg = " + avg);
        Cat boris = new Cat("boris", 5);
        Cat murka = new Cat("murka", 7);

        boris.meow();
    }

    private static double getAvg(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return avg;
    }

    private static void printSum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}