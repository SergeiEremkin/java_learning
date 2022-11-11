package classwork_5;

import java.util.*;

public class task3 {

    public static void main(String[] args) {
        // Написать программу, определяющую правильность расстановки скобок в выражении.
        // Пример 1: a+(d*3) - истина
        // Пример 2: [a+(1*3) - ложь
        // Пример 3: [6+(3*3)] - истина
        // Пример 4: {a}[+]{(d*3)} - истина
        // Пример 5: <{a}+{(d*3)}> - истина
        // Пример 6: {a+]}{(d*3)} - ложь
        Stack<Character> st = new Stack<>();
        String equation = "[a+(1*3)]";
        Map<Character, Character> chars = new HashMap<Character, Character>();
        chars.put('}', '{');
        chars.put(')', '(');
        chars.put(']', '[');
        chars.put('>', '<');

        boolean t = true;
        for (int i = 0; i < equation.length(); i++) {
            if (chars.containsValue(equation.charAt(i))) {
                st.add(equation.charAt(i));
            } else if (chars.containsKey(equation.charAt(i))) {
                char a = st.pop();
                if (a != chars.get(equation.charAt(i)) || !st.isEmpty()) {
                    t = false;
                    break;
                }
            }
        }
        if (t) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
