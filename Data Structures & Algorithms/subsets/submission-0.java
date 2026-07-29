class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(nums,0,temp,ans);
        return ans;
    }

    public void helper(int arr[], int i, List<Integer> temp, List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        helper(arr,i+1,temp,ans);
        temp.add(arr[i]);
        helper(arr,i+1,temp,ans);
        temp.remove(temp.size()-1);
    }
}
