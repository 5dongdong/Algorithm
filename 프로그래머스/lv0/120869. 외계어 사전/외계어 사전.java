class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String dicSpell : dic) {
            int cnt = 0;
            for(String s : spell) {
                if(dicSpell.contains(s)) {
                    cnt ++;
                }
            }
                if(cnt == spell.length) {
                    answer = 1;
                    break;
                } else {
                    answer = 2;
                }
            }
                return answer;
        }
    }
