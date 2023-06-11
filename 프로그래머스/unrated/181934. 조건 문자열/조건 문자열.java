class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String str = ineq + eq;
        if (eq.equals("=")) {
            if (str.equals("<=")) {
                return n <= m ? 1 : 0;
            } else {
                return n >= m ? 1 : 0;
            }
        } else {
            if (ineq.equals("<")) {
                return n < m ? 1 : 0;
            } else {
                return n > m ? 1 : 0;
            }
        }
    }
}