class Solution {
public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = n_str.split(""); 
        for(int i=0; i<arr.length; i++) { 
            if(!arr[i].equals("0")) {          
                for(int j=i; j<arr.length; j++) {
                    sb.append(arr[j]);                    
                }
                break;
            }
        }
        return sb.toString();          
    }
}
