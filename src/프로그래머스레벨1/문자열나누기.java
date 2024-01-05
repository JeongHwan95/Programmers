package 프로그래머스레벨1;

import java.util.Stack;

// Stack을 이용한 풀이
public class 문자열나누기 {

	public static void main(String[] args) {
		
	} 
	
	
    public int solution(String s) {
        
    	Stack<Character> stack = new Stack<>();
    	int answer = 0;
    	
    	int otherSize = 0;
    	boolean flag = true;
    	for(int i=0; i<s.length(); i++) {
    		
    		if(flag) {
    			stack.add(s.charAt(i));
    			flag = false;
    		}
    		else if(stack.peek() == s.charAt(i)) {
    			stack.add(s.charAt(i));
    		}
    		else {
    			otherSize++;
    			if(stack.size() == otherSize) {
    				stack.clear();
    				answer++;
                    otherSize =0;
    				flag = true;
    			}
    		}
    		
    	} // for
    	
    	if(!stack.isEmpty()) {
    		answer++;
    	}
    	
    	
        return answer;
    }
}
