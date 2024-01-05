package 프로그래머스레벨2;

import java.util.StringTokenizer;

public class 최댓값과최솟값 {
    public String solution(String s) {
        
    	StringTokenizer st = new StringTokenizer(s);
    	
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	
    	while(st.hasMoreTokens()) {
    		
    		int token = Integer.parseInt(st.nextToken());
    		
    		if(token < min)
    			min = token;
    		
    		if(token > max)
    			max = token;
    		
    	}
    	
    	String answer = min+" "+max;
        return answer;
    }
}
