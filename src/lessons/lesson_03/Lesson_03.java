package lessons.lesson_03;

public class Lesson_03 {
    public static void main(String[] args) {
//        String str = "Java";
//        System.out.println(str);
//        System.out.println(str.hashCode());
//        str = str + "!!!";
//        System.out.println(str);
//        System.out.println(str.hashCode());
//        int strLength = str.length();
//        System.out.println(strLength);
//        System.out.println(str.charAt(strLength-1));
//        System.out.println(str.substring(4));
//        System.out.println(str.substring(1,5));
//        String upperCaseString = "JAVA";
//        System.out.println(upperCaseString);
//        System.out.println(upperCaseString.toLowerCase());
//        String lowerCaseString = "java";
//        System.out.println(lowerCaseString);
//        System.out.println(lowerCaseString.toUpperCase());

//        Создать строку “I like Java”
//        Распечатать последний символ строки. Используем метод String.charAt().
//        Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        String like = "I like Java";
        System.out.println(like.charAt(like.length()-1));
        System.out.println(like.endsWith("!!!"));
        System.out.println(like.startsWith("I like"));
        System.out.println(like.contains("Java"));
    }
}
