package 프로그래머스레벨1;

public class 삼총사 {

	public int solution(int[] number) {
		int answer = 0;
		
		
		for(int i=0; i<number.length-2; i++) {
			for(int j=i+1; j<number.length-1; j++) {
				for(int k=j+1; k<number.length; k++) {
					int check = number[i] + number[j] + number[k];
					if(check == 0)
						answer++;
				}
			}
		}
		
		return answer;
		
	
	}
}

