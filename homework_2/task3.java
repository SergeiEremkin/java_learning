package homework_2;

public class task3 {
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
    public static void main(String[] args) {
        //Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
        String text = "aabaa";
        System.out.println(isPalindrome(text));
    }
}
