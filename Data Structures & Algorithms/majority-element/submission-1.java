class Solution {
    public int majorityElement(int[] nums) {
        int threshold=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,map.get(i));
            if(max>threshold)
                return i;
        }
        return -1;
        
    }
}