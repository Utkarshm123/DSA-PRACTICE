class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int j=1; j<nums.length; j++){
            if(nums[j] == nums[j-1]){
                return true;
                
            }
        }
        return false;
    }
}