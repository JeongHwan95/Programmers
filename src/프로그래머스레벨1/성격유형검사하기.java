package 프로그래머스레벨1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
	public String solution(String[] survey, int[] choices) {
		
		Map<Character, Integer> rank = new HashMap<>();
		
		rank.put('R', 0);
		rank.put('T', 0);
		rank.put('C', 0);
		rank.put('F', 0);
		rank.put('J', 0);
		rank.put('M', 0);
		rank.put('A', 0);
		rank.put('N', 0);

	
		int idx = 0;
		for(int scr : choices) {
			
			
			if(scr<4) {
				int score =0;
				if(scr==1) {
					score = 3;
				}else if(scr==2) {
					score = 2;
				}else if(scr==3) {
					score = 1;
				}
				
				rank.put(survey[idx].charAt(0), rank.get(survey[idx].charAt(0))+score);
			}else if(scr>4) {
				rank.put(survey[idx].charAt(1), rank.get(survey[idx].charAt(1))+scr-4);
			}
			
			idx++;
		}
		
		String answer = "";
		if(rank.get('R') >= rank.get('T')) {
			answer += 'R';
		}else {
			answer += 'T';
		}
			
		if(rank.get('C') >= rank.get('F')) {
			answer += 'C';
		}else {
			answer += 'F';
		}
		
		if(rank.get('J') >= rank.get('M')) {
			answer += 'J';
		}else {
			answer += 'M';
		}
		
		if(rank.get('A') >= rank.get('N')) {
			answer += 'A';
		}else {
			answer += 'N';
		}
		return answer;
	}
}
