package 프로그래머스레벨1;

import java.util.ArrayList;
import java.util.List;

public class x만큼간격있는n개의숫자 {
	 public long[] solution(int x, int n) {
		 
		 List<Long> list = new ArrayList<>();
		 
		 for(int i=0; i<n; i++) {
			 
			 list.add((long)x*(i+1));
		 }
		 
		 long[] answer = new long[list.size()];
		 for(int i=0; i<list.size(); i++) {
			 
			 answer[i] = list.get(i);
		 }
		 
		 return answer;
	 }
}
