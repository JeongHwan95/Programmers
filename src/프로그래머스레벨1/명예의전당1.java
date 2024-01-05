package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당1 {

    public int[] solution(int k, int[] score) {
        
    	int idxK = 0;
    	List<Integer> rank = new ArrayList<>();
    	List<Integer> answerList = new ArrayList<>();
    	
    	for(int scr : score) {
    		
    		if(idxK < k) {
    			
                idxK++;
    			rank.add(scr);
    			Collections.sort(rank);
    			answerList.add(rank.get(0));
    		}else {
    			
    			if(rank.get(0) < scr) {
    				
                    System.out.println(rank.get(0) + ", " + scr);
                    
    				rank.remove(0);
    				rank.add(scr);
    				Collections.sort(rank);
    				answerList.add(rank.get(0));
    			}else {
    				
    				answerList.add(rank.get(0));
    			}
    		}
    	} // for
    	
    	
    	int[] answer = new int[answerList.size()];
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = answerList.get(i);
    	}
    	
        return answer;
      }
}
