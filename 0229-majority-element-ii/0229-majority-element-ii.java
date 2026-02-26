class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;
        int n = size/3;
        int j =n;
        while(j<size){
             if(j== 0 || (j-n)<0 || nums[j]==nums[j-n])
                {
                    ans.add(nums[j]);
                   int target = nums[j];
                    while(j<size && nums[j]==target) 
                        j++;
                }
                else 
                  j++;
            
        }
        return ans;
    }
}