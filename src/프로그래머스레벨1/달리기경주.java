package 프로그래머스레벨1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

	
	public String[] solution(String[] players, String[] callings) {
		
		Map<String, Integer> rankMap = new HashMap<>();
		for(int i=0; i<players.length; i++) {
			rankMap.put(players[i], i);
		}
		
		for(int i=0; i<callings.length; i++) {
			
			int rank = rankMap.get(callings[i]);
			String beforePlayer = players[rank-1];
			
			rankMap.put(beforePlayer, rank);
			rankMap.put(callings[i], rank-1);
			
			players[rank-1] = callings[i];
			players[rank] = beforePlayer;
		}
		
		return players;
	}
	
//	 public String[] solution(String[] players, String[] callings) {
//	    	Map<String, Integer> map = new HashMap<>();
//	    	for(int i=0; i<players.length; i++) {
//	    		map.put(players[i], i);
//	    	} 
//	    	
//	    	for(int i=0; i<callings.length; i++) {
//	    		String player = callings[i];
//	    		int rank = map.get(player);
//	    		String beforePlayer = players[rank-1];
//	    		
//	    		map.put(player, rank-1);
//	    		map.put(beforePlayer, rank);
//	    		
//	    		players[rank] = players[rank-1];
//	    		players[rank-1] = player;
//	    		
//	            
//	            for(String player1 : players) {
//	    			System.out.print(player1+" ");
//	    		}
//	    		System.out.println();
//	    	} // for
//	    	
//	    	return players;
//	    }

}
