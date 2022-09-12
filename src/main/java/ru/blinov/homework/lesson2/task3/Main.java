package ru.blinov.homework.lesson2.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> examples = new LinkedHashMap<>();

        examples.put("car", "ca6$$#_rtwheel");
        examples.put("cwhl", "cartwheel");
        examples.put("cwhee", "cartwheel");
        examples.put("cartwheel", "cartwheel");
        examples.put("cwheeel", "cartwheel");
        examples.put("lw", "cartwheel");

        System.out.println();
        examples.forEach((key, value) ->
                System.out.println("[" + key + ", " + value + "]" + ": " + fuzzySearch(key, value)));
    }

    private static boolean fuzzySearch(String s1, String s2) {

        if(s1 != null && s2 != null) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            if (s1.equals(s2)) {
                return true;
            }

            int j = 0;
            int score = 0;

            for (int i = 0; i < s1.length(); i++) {
                char char1 = s1.charAt(i);
                for (; j < s2.length(); j++) {
                    char char2 = s2.charAt(j);
                    if (char1 == char2) {
                        j++;
                        score++;
                        break;
                    }
                }
            }
            return score == s1.length();
        } else {
            throw new IllegalArgumentException("String must not be null");
        }
    }
}
