class Solution {
    public int solution(String s) {
        String[] Arr = s.split(" ");
        int result = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i].equals("Z")) {
                result -= Integer.parseInt(Arr[i - 1]);
                continue;
            }
            result += Integer.parseInt(Arr[i]);
        }
        return result;
    }
}