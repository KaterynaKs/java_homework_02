package lessons.lesson_03;

public class CharToInt {
    public static void main(String[] args) {
        //        int to char using ASCII
//        int num = 65;
//        char ch = (char)num;
//        System.out.println(ch);
//        char chToInt = 'A';
//        int numChar = chToInt;
//        System.out.println(numChar);

        //        String.valueOf() UNICODE
//        char chValueOf = String.valueOf('\u0078').charAt(0);
//        System.out.println(chValueOf);
//
//        //        Char.getNumericValue()
//        char chGetNumericValue = Character.valueOf('\u0078');
//        System.out.println(chGetNumericValue);

        //        Char.getNumericValue()
        int chGetNumericValue = Character.getNumericValue('A');
        System.out.println(chGetNumericValue);

    }
}
