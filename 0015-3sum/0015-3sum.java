class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-2;i++){
            int j =i+1 , k = nums.length-1;
            int target = nums[i]*-1;
            while(j<k){
                 int sum = nums[j]+nums[k];
                 if(sum == target && !ans.contains(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]))))
                    { ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    System.out.println(i +"" + j +""+k);
                    }
                   if(target>=sum)
                      j++;
                    else 
                     k--; 
            }
        }
        return ans.stream().collect(Collectors.toList());
    }
}