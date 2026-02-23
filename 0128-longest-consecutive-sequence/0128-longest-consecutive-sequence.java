class Solution {
    public int longestConsecutive(int[] nums) {

        
        Arrays.sort(nums);
        // for(int num:nums)
        // System.out.print(num);\
         int ls= Integer.MIN_VALUE;
         int max=0;
         int currSeq = 1;
         for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(curr-1==ls){
                currSeq++;
                ls=curr;
            }else if(curr!=ls){
                ls=curr;
                currSeq=1;
            }
            max = Math.max(max,currSeq);
         }
         return max;
    }
}