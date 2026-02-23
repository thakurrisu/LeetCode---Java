class Solution {
    public int longestConsecutive(int[] nums) {
        
         HashSet<Integer> hs = new HashSet<Integer>();
         for(int num : nums)
	       hs.add(num);
           int maxCount=0;
         for(int element : hs){
            int current = element+1;
            int count =1;
            if(!hs.contains(element-1)){
                while(hs.contains(current))
                  {
                    count++;
                    current++;
                  }
            }
            maxCount = Math.max(maxCount,count);
         }
         return maxCount;
    }
}