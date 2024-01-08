package 프로그래머스레벨1;

public class 문자열내p와y의개수 {
	  boolean solution(String s) {
		  
		  String newS = s.toLowerCase();
		  int pCnt = 0;
		  int yCnt = 0;
		  for(int i=0; i<newS.length(); i++) {
			  
			  if(newS.charAt(i) == 'y') {
				  yCnt++;
			  }
			  if(newS.charAt(i) == 'p') {
				  pCnt++;
			  }
		  }
		  
		  if(pCnt == yCnt) {
			  return true;
		  }else
			  return false;
	  }
}
