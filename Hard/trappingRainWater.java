class Solution {
    public int trap(int[] height) {
        if(height.length < 3) return 0; 
        int lMax = height[0] ; 
        int rMax = height[(height.length - 1) ]; 
        int l = 0; 
        int r = height.length - 1; 
        int result = 0; 
        while(l < r){
            if(lMax <= rMax){
                l+=1; 
                lMax = height[l] > lMax ? height[l] : lMax; 
                result += lMax - height[l];
            }
            else{
                r-=1; 
                rMax = height[r] > rMax ? height[r] : rMax; 
                result += rMax - height[r];
            }
        }
        return result ; 
    }
    
}
