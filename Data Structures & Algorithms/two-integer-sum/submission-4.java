class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<n; i++){
            int complement = target-nums[i];
            if(seen.containsKey(complement)){
                result[0]=seen.get(complement);
                result[1]=i;
                return result;
            }
            seen.put(nums[i], i);
        }
        return result;
    }
}
