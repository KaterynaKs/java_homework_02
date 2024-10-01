public class Main1 {
    public static void main(String[] args) {
//        TASK 1
        char character = 'G';
        int integer = 89;
        byte byteValue = 4;
        short shortValue = 56;
        float floatValue = 4.7333436F;
        double doubleValue = 4.355453532;
        long longValue = 12121L;
        System.out.println("char: " + character);
        System.out.println("int: " + integer);
        System.out.println("byte: " + byteValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("long: " + longValue);

//        TASK 2

        int value = 345;

        //Option 1
        System.out.println("Число " + value + " -> " + value/100 + ", " + value/10%10 + ", " + value%10);

        //Option 2
        String valueStr = Integer.toString(value);
        System.out.println("Число " + value + " -> " + valueStr.charAt(0) + ", " + valueStr.charAt(1) + ", " + valueStr.charAt(2));

    }
}