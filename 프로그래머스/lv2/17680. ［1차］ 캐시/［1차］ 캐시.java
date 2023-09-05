import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> caches = new LinkedList<>();
        int answer = 0;
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if(!caches.contains(city)) {
                answer += 5;
                if(caches.size() >= cacheSize) {
                    caches.remove(0);
            }
            caches.add(city);
            continue;
        }
        
        if(caches.contains(city)) {
            caches.remove(city);
            caches.add(city);
            answer += 1;
        }
    }
        return answer;
}
}