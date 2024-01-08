package 프로그래머스레벨1;

// 시간값 오류난다. 
// 왜일까..? 
public class 소수찾기 {
	public int solution(int n) {
    
		int answer = 0;
		for(int i=2; i<=n; i++) {
			
			boolean flag = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			
			
			if(flag) {
				answer++;
			} // if
		} //for
		
        return answer;
        
    } // solution
} // 소수찾기
