package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.List;

public class 가장가까운같은글자 {

	public static void toString(int[] result) {
		
		for(int i : result) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] result1 = solution("banana");
		toString(result1);

		System.out.println();
		
		int[] result2 = solution("foobar");
		toString(result2);
		
		
	}
	
    public static int[] solution(String s) {
    	
    	List<Integer> list = new ArrayList<>();
    	list.add(-1);
    	
    	for(int i=1; i<s.length(); i++) {
    		
    		int count = 0;
    		boolean flag = false;;
    		for(int j=i-1; j>=0; j--) {
    			
    			count++;
    			if(s.charAt(i) == s.charAt(j)) {
    				list.add(count);
    				flag = true;
    				break;
    			}
    		}
    		
    		if(!flag) {
    			list.add(-1);
    		}
    	} // for
    	
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
