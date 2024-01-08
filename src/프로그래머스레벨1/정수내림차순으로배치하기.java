package 프로그래머스레벨1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	public long solution(long n) {
		
		
		String s = String.valueOf(n);
		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		
		String k = "";
		for(int i=0; i<arr.length; i++) {
			k += "" + arr[i];
		}
		
		return Long.parseLong(k);
		
	}
}
