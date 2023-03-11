import java.util.*;
class Solution {
    public int solution(int n) {
    List<Integer> list=new ArrayList<>();
        
        for(int i=1; i<=10; i++) {
			if(i<=n) {list.add(i);}
		}
        int num=list.size();
		while(num>0) {
			int temp=1;
			for(int i=num; i>=1; i--) {
				temp*=i;
			}
			if(temp<=n) 
                break;
			num--;	
		}
        return num;
    }
}