package 프로그래머스레벨2;

import java.util.StringTokenizer;

public class JadenCase문자열만들기 {
    public String solution(String s) {
    	
    	s = s.toLowerCase();
    	
    	StringTokenizer st = new StringTokenizer(s);
    	
    	String answer = "";
    	while(st.hasMoreTokens()) {
    		String word = st.nextToken();
    		char letter = word.charAt(0);
    		
    		if(97 <= (int)letter && (int)letter <= 122) {
    			letter -= 32;
    			
    			answer = answer + letter;
    			for(int i=1; i<word.length(); i++) {
    				answer += word.charAt(i);
    			}
    			
    			answer += " ";
    		} // if
    		else {
    			
    			answer += word + " ";
    		}
    	}
    	
    	answer = answer.trim();
    	
    	if(s.charAt(0) == ' ' && s.charAt(s.length()-1) == ' ' && s.length()>1) {
    		answer = " " + answer + " ";
    	}else if(s.charAt(0) == ' ') {
    		answer = " " + answer;
    	}else if(s.charAt(s.length()-1) == ' ') {
    		answer = answer + " ";
    	}
    	
    	
        return answer;
    }
}
