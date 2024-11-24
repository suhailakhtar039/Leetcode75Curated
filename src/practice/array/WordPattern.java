package practice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat dog dog cat";

        String[] strings = s.split(" ");

        Map<Character, String> map = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            char c = pattern.charAt(i);
            String w = strings[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) {
                    System.out.println(false);
                }
            } else {
                if (seenWords.contains(w)) {
                    System.out.println(false);
                }
                map.put(c, w);
                seenWords.add(w);
            }
        }
        System.out.println(true);
    }
}
