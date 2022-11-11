package classwork_5;

import java.util.*;

public class task2 {
    public static Boolean checkSymbols(String word1, String word2) {
        Map<String, String> map = new HashMap<String, String>();
        if (word1.length() != word2.length()) {
            return false;
        }
        var wordArr1 = word1.split("");
        var wordArr2 = word2.split("");
        for (int i = 0; i < wordArr1.length; i++) {
            if (map.containsKey(wordArr1[i])) {
                if (!map.get(wordArr1[i]).equals(wordArr2[i])) {
                    return false;
                }

            } else {
                map.put(wordArr1[i], wordArr2[i]);

            }
        }
        System.out.println(map);
        return true;
       
    }

    public static void main(String[] args) {
        // Даны 2 строки, написать метод, который вернет true, если эти строки являются
        // изоморфными и false,
        // если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
        // некоторую букву во втором слове, при этом
        // повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
        // порядка следования. (Например, add - egg изоморфны)
        // буква может не меняться, а остаться такой же. (Например, note - code)
        // Пример 1:
        // Input: s = "foo", t = "bar"
        // Output: false
        // Пример 2:
        // Input: s = "paper", t = "title"
        // Output: true
        System.out.println(checkSymbols("paper", "title"));

    }
}
