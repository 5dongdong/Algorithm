class Solution {
    public String solution(String code) {
        // if (code.isEmpty()) {
        //     return "EMPTY";
        // }
        StringBuilder ret = new StringBuilder();
        boolean mode = false; 

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (mode == false) {
                if (i % 2 == 0 && c != '1') {
                    ret.append(c);
                } else if (c == '1') {
                    mode = true;
                }
            } else {
                if (i % 2 == 1 && c != '1') {
                    ret.append(c);
                } else if (c == '1') {
                    mode = false;
                }
            }
        }
        
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret.toString();
        }
    }
}
