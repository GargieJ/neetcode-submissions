class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> memory = new HashSet<>();
        for (int i:nums){
            if (memory.contains(i)){
                return true;
            }
            memory.add(i);
        }
        return false;
 }}