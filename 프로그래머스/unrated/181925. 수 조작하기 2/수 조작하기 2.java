class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int currentValue = numLog[0]; 
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1]; 

            if (diff == 1) {
                sb.append("w"); 
                currentValue += 1;
            } else if (diff == -1) {
                sb.append("s"); 
                currentValue -= 1;
            } else if (diff == 10) {
                sb.append("d"); 
                currentValue += 10;
            } else if (diff == -10) {
                sb.append("a"); 
                currentValue -= 10;
            }
        }

        return sb.toString();
    }
}
