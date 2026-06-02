class Solution {
    public int search(int[] nums, int target) {
        int first = 0 , end = nums.length-1;
    
        while(first <= end) {
            int mid = (end + first)/2;
           // System.out.println(mid );
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else first = mid+1;
        }
        return -1;
    }
}