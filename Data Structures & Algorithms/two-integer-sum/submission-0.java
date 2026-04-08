class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        map.put(target-nums[0],0);
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(!map.containsKey(num))
                map.put(target-nums[i],i);
            else{
                ans[0]=map.get(num);
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}
