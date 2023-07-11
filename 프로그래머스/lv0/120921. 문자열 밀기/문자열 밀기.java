class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0; // A와 B가 이미 같으면 밀 필요 없음
        }

        int n = A.length();
        for (int i = 1; i <= n; i++) {
            String shifted = A.substring(n - i) + A.substring(0, n - i);
            if (shifted.equals(B)) {
                return i; // i번 밀어서 B를 만들 수 있음
            }
        }

        return -1; // A를 밀어서 B를 만들 수 없음
    }
}
