import java.util.ArrayList;

class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> res = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        int[] lps = new int[m];
        int lenLps = 0; 
        int i = 1;
        
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(lenLps)) {
                lenLps++;
                lps[i] = lenLps;
                i++;
            } else {
                if (lenLps != 0) {
                    lenLps = lps[lenLps - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        i = 0; 
        int j = 0;
        
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                res.add(i - j);
                j = lps[j - 1];
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return res;
    }
}