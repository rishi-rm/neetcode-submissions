class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int x: nums)
            if(seen.containsKey(x)) return true;
            else seen.put(x, 1);

        return false;
    }
}