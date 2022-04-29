class Solution {
    public int firstMissingPositive(int[] nums) {
        int hasOne = 0; 
        for(int i : nums){
            if(i == 1) hasOne = 1; 
        }
        if(hasOne == 0) return 1; 
        
        for(int i = 0; i <nums.length; i++){
            if(nums[i] <=0) nums[i] = 1; 
            else if(nums[i] > nums.length) nums[i] = 1;
        }
        
        for(int i = 0; i < nums.length; i++){
            int a = Math.abs(nums[i]); 
            
            if(a == nums.length) nums[0] = -Math.abs(nums[0]); 
            else nums[a] = -Math.abs(nums[a]); 
            
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0)
                return i;
        }

        if (nums[0] > 0)
            return nums.length;

        return nums.length + 1;
    }
}
