import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String TieBreak(String arr[]) {
        HashMap<String, Integer> voteMap = new HashMap<>();
        for (String name : arr) {
            voteMap.put(name, voteMap.getOrDefault(name, 0) + 1);
        }
        String winner = "";
        int maxVotes = -1;
        
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            
            if (votes > maxVotes) {
                maxVotes = votes;
                winner = candidate;
            } 
            else if (votes == maxVotes) {
                if (candidate.compareTo(winner) < 0) {
                    winner = candidate;
                }
            }
        }
        
        return winner;
    }
}