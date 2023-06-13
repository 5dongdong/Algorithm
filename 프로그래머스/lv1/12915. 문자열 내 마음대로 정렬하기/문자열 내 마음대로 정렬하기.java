import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String s1 = strings[i];
                String s2 = strings[j];

                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    if (s1.compareTo(s2) > 0) {
                        strings[i] = s2;
                        strings[j] = s1;
                    }
                } else if (c1 > c2) {
                    strings[i] = s2;
                    strings[j] = s1;
                }
            }
        }

        return strings;
    }
}
