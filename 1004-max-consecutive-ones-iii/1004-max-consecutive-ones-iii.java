class Solution {
    public int longestOnes(int[] nums, int k) {
        int i =0 , j =0;
        int n = nums.length;
        int maxLength = 0;
        while(j<n){
            if(nums[j]==1) j++;
            else{
                if(nums[j]==0 && k!=0) {
                    j++;
                    k--;
                }
                else 
                { 
                    if(nums[i]==0)  k++;
                i++;
                }
               
            }
            maxLength = Math.max(maxLength , j-i);

        }
        return maxLength;
    }
}