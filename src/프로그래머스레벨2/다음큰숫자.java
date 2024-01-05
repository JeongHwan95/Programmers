package 프로그래머스레벨2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        
        
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
        	
        	if(s.charAt(i) == '1') {
        		cnt++;
        	} // if
        } // for
        
        
        for(int i=n+1; i<=1000000; i++) {
        	
        	String k = Integer.toBinaryString(i);
        	int innerCnt = 0;
        	for(int j=0; j<k.length(); j++) {
        		if(k.charAt(j) == '1') {
        			innerCnt++;
        		}
        	}
        	
        	if(cnt == innerCnt) {
        		answer = i;
        		break;
        	}
        }
        
        
        return answer;
    } // solution
}
