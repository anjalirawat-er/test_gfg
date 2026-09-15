class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int k : arr) {
            if (seen.contains(k)) {
                duplicates.add(k);
            } else {
                seen.add(k);
            }
        }

        return duplicates;
    }
}