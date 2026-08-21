class Solution {
  public ArrayList<Integer> getMinMax(int[] arr) {
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];

        }
        if(max<arr[i]){
            max=arr[i];
        }


    }
    ArrayList<Integer> ans = new ArrayList<>();

        ans.add(min);
        ans.add(max);

        return ans;
    }
}
