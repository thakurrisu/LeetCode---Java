class Solution {
    public int[] countBits(int n) {
     int[] ans = new int[n+1];
     int curr = 2;
     ans[0] = 0;
     for(int i=1 ; i <=n; i++ ) {
     if( i == 1)
        ans[i] = 1;
        else {
            if(i % curr == 0){
                curr = i;
                ans[i]  = 1;
            } else {
              ans[i] =  ans[i/curr] + ans[i%curr];
            }
        }
     }  
     return ans; 
    }
}