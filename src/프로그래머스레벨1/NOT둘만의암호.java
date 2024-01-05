package 프로그래머스레벨1;

import java.util.ArrayDeque;
import java.util.Queue;

// Blog에 나와 있는 경계값 테스트 해보기
// https://iyk2h.tistory.com/332

public class NOT둘만의암호 {
	
    public String solution(String s, String skip, int index) {
        
    	Queue<Character> queue = new ArrayDeque<>();
    	
    	for(int i=0; i<s.length(); i++) {
    		
    		int count = 0;
    		for(int j=0; j<skip.length(); j++) {
    			
    			if( (int)s.charAt(i) < (int)skip.charAt(j)  &&
    					(int)skip.charAt(j) <= index+(int)s.charAt(i)) {
    				count++;
    			}
    		}
    		Character input = (char)(index+(int)s.charAt(i)+count);			
            if(123<=(int)input){
                input=(char)((int)input-26);
            }
    		queue.add(input);
    	}
    	String answer = "";
    	while(!queue.isEmpty()) {
    		answer += queue.poll();
    	}
        return answer;
    }
}
