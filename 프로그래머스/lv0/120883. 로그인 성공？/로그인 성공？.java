import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for(String[] String : db) {
            map.put(String[0], String[1]);
        }
        
        if(map.containsKey(id_pw[0])) {
            if(map.get(id_pw[0]).equals(id_pw[1])){
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}