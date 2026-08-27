class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            List<Integer> current = new ArrayList<>();
               for (int j = i; j < arr.length; j++){
        current.add(arr[j]);
        ans.add(new ArrayList<>(current));
    }
}
    return ans;       
        
    }
}