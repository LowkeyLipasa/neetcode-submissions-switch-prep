class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int nextSpace=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=val)
                nums[++nextSpace]=nums[i];
        }
        return nextSpace+1;
    }
}