package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.List;


// 주의사항 : 
// 1. int형 자리수 10자리, long 최대길이 19자리
// 
public class 크기가작은부분문자열 {
	
	public static void main(String[] args) {
		
//		System.out.println(solution("3141592", "271"));
//		System.out.println(solution("500220839878", "7"));
		System.out.println(solution("10203", "15"));
		
	} // main
	
    public static int solution(String t, String p) {
        
    	int answer = 0;
    	int length = p.length();
    	List<String> candidates = new ArrayList<>();
    	
    	for(int i=0; i<t.length()-length+1; i++) {
    		
    		String candidate = t.substring(i, i+length);
    		candidates.add(candidate);
    		System.out.println(candidate);
    	} // for
    	
    	for(String candidate : candidates) {
    		
    		long intCandi = Long.parseLong(candidate);
    		Long intP = Long.parseLong(p);
    		
    		if(intCandi <= intP) {
    			answer++;
    		}
    	}
    	
        return answer;
    }
}
