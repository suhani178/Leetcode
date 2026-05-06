class Solution {
    public int search(int[] nums, int target) {
        int Left = 0;
        int Right = nums.length-1;
        while(Left <= Right){
            int Mid = Left + (Right - Left) / 2;
            if(nums[Mid]==target){
                return Mid;
            }
            else if (nums[Mid] < target){
                Left = Mid + 1;   
            }
            else{
                Right = Mid - 1;
            }
        }
        return -1;
        
    }
}