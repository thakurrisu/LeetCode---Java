class Solution {
    public boolean isHappy(int n) {
       boolean flag = false;
       HashSet<Integer> visited = new HashSet<>();
       while(!flag){
           int sum = 0;
        while(n > 0){
            int digit = n %10 ;
            n = n /10;
            sum += (digit * digit);
        }
        if(sum == 1) return true;
        if(visited.contains(sum)) flag = true;
        n = sum; 
        visited.add(sum);
       } 
        return false;
    }
}