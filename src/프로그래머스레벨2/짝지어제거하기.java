package 프로그래머스레벨2;

import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s){
        int answer = -1;
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char alphabet : arr) {
        	
        	if(stack.isEmpty())
        		stack.push(alphabet);
        	else {
        		if(stack.peek()==alphabet) {
        			stack.pop();
        		}else {
        			stack.push(alphabet);
        		}
        	}
        }
        
        
        answer = stack.isEmpty() ? 1 : 0;
        
        return answer;
    }
}
