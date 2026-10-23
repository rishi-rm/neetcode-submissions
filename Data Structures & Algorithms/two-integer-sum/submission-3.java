class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<n; i++){
            seen.put(nums[i], i);
        }

        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement) && seen.get(complement)!=i){
                result[0]=i;
                result[1]=seen.get(complement);
                return result;
            }
        }

        return result;
    }
}
