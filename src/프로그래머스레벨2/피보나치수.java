package 프로그래머스레벨2;

public class 피보나치수 {
	
	static int[] memo = new int[100001];
    public int solution(int n) {
    	
    	long answerLong = fibo(n);
        int answer = (int) (answerLong/1234567);
        
        return answer;
    }
    
    
    
    public static int fibo(int n) {
    	
    	if(n==1 || n==0) {
    		return n;
    	}else if(memo[n]!=0) {
    		return memo[n];
    	}
    	else {
    		return memo[n]=fibo(n-1)+fibo(n-2);
    	}
    }
}
