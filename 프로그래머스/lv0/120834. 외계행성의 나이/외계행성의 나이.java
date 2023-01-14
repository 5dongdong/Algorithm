class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        // a -> 97
        
        while(age > 0){
            sb.append((char)(97 + age %10));
            age /=10;
        }
        
        return String.valueOf(sb.reverse());
    }
}