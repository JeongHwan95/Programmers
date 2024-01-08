package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.List;

public class 자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
        
        String s = String.valueOf(n);
        List<Character> list = new ArrayList<>();
        
        for(int i=s.length()-1; i>=0; i--) {
        	
        	list.add(s.charAt(i));
        } // for
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = Integer.parseInt(String.valueOf(list.get(i)));
        }
        return answer;
    }
}
