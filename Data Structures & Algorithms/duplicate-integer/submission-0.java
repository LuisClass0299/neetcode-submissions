class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            boolean bad = duplicates.add(nums[i]);
            if(bad == false){
                return true;
            }
        }
        return false;
    }
}