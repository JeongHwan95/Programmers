package 프로그래머스레벨2;

public class 숫자의표현 {
	public int solution(int n) {
        
		int answer = 0;
		for(int i=0; i<=n; i++) {
			
			int sum = 0;
			for(int j=i; j<=n; j++) {
				sum +=j;
				
				if(sum==n) {
					answer++;
					break;
				}
			}
			
		}
		
        return answer;
    }
}
