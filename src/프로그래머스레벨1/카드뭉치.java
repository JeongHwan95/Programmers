package 프로그래머스레벨1;

public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {

		int idx1 = 0;
		int idx2 = 0;

		for (String value : goal) {
			if (value.equals(cards1[idx1])) {
				if (idx1 != cards1.length-1) {
					idx1++;
				} 
			} else if (value.equals(cards2[idx2])) {
				if (idx2 != cards2.length-1) {
					idx2++;
				} 
			} else {
				return "No";
			}
		}
		return "Yes";
	}
}
