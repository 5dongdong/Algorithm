class Solution {
    public String solution(String myString) {
        String answer = "";
        // answer = myString.replace("a", "A").replaceAll("^[B-Z]*$", "^[b-z]*$");
        answer = myString.replace("a", "A");
        for (char c = 'B'; c <= 'Z'; c++) {
            answer = answer.replace(Character.toString(c), Character.toString(c).toLowerCase());
        }
        return answer;
    }
}