package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://velog.io/@se_bb/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Java-%EB%8C%80%EC%B6%A9-%EB%A7%8C%EB%93%A0-%EC%9E%90%ED%8C%90
public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {

    	Map<Character, Integer> map = new HashMap<>();
    	List<Integer> answerList = new ArrayList<>();
    	for(int i=0; i<keymap.length; i++) {
    		
    		for(int j=keymap[i].length()-1; j>=0; j--) {
    			
    			if(map.containsKey(keymap[i].charAt(j))) {
    				int value = map.get(keymap[i].charAt(j));
    				map.put(keymap[i].charAt(j), Math.min(j+1, value));
    			}else {
    				map.put(keymap[i].charAt(j), j+1);
    			}
    		}
    	}
    	
//		여기 위까지는 검사 완료
    	
    	for(String target : targets) {
    		
    		int sum = 0;
    		
    		for(int i=0; i<target.length(); i++) {
    			
    			if(map.containsKey(target.charAt(i))) {
    				sum += map.get(target.charAt(i));
    			}else {
    				sum = -1;
    				break;
    			}
    		}
    		
    		
    		answerList.add(sum);
    	} // for
    	
    	int[] answer = new int[answerList.size()];
    	for(int i=0; i<answerList.size(); i++) {
    		answer[i] = answerList.get(i);
    	}
    	
    	return answer;
    }
}
