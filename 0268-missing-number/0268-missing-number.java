class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int size = nums.length;
        for(int i = 0 ; i<size ; i++ )
          { 
            ans = ans^nums[i];
            ans = ans ^ i;
          }
        return  ( ans ^ size);
    }
}