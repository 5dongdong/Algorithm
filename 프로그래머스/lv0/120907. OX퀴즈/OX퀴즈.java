class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String [] sArr = quiz[i].split(" ");
            
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[2]);
            int c = Integer.parseInt(sArr[4]);
            
            if(sArr[1].equals("+")) {
                if((a + b) == c) {
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            }
            
            if(sArr[1].equals("-")) {
                if((a - b) == c) {
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}