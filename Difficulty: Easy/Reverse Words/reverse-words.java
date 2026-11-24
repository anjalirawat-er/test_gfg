class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
            if (s.charAt(i) == '.') {
                i--;
                continue;
            }
            int j = i;
            while (i >= 0 && s.charAt(i) != '.') {
                i--;
            }

            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(s.substring(i + 1, j + 1));
        }
        return sb.toString();
    }
}
