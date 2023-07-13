class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int cnt = 0;
        String regex = "[0-9]+";
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                babbling[i] = babbling[i].replace(arr[j], "1");
            }
             System.out.println(babbling[i]);
        }
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].matches(regex)) {
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }
}