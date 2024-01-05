package 프로그래머스레벨1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
    	int ans = 1;
    	int start = section[0];
    	int end = section[0]+m-1;
    	
    	for(int value : section) {
    		
    		if(value > end) {
    			start = value;
    			end = value+m-1;
    			ans++;
    		}
    		
    	} // for
    	
    	return ans;
    }
    
    
//    public int solution(int n, int m, int[] section) {
//    	int start = section[0];
//    	int end = section[0]+m-1;
//    	int ans = 1;
//    	
//    	for(int cur : section) {
//    		if(cur<=end) {
//    			continue;
//    		}else {
//    			start = cur;
//    			end = cur+m-1;
//    			ans++;
//    			
//    		}
//    	}
//    	
//    	
//    	return ans;
//    }
}			
			