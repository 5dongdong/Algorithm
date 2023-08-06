class Solution {
    public String solution(String a, String b) {
        int carry = 0;
        int maxLength = Math.max(a.length(), b.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            int numA = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int numB = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;

            int sum = numA + numB + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}