package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NOT숫자짝꿍 {
	
	
    public String solution(String X, String Y) {
        
    	Map<String, Integer> xMap = new HashMap<>();
    	Map<String, Integer> yMap = new HashMap<>();
    	
    	List<String> list = new ArrayList<>();
    	
    	for(String key : X.split("")) {
    		xMap.put(key, xMap.getOrDefault(key, 0)+1);	
    	}
    	
    	for(String key : Y.split("")) {
    		yMap.put(key, yMap.getOrDefault(key, 0)+1);
    	}
    	
    	for(String key: xMap.keySet()) {
    		if(!yMap.containsKey(key)) continue;
    		
    		int length = Math.min(xMap.get(key), yMap.get(key));
    		for(int i=0; i<length; i++) {
    			list.add(key);
    		}
    	}
    	
    	
    	
        return "-1";
    }
}
