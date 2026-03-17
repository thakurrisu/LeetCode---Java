class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int index = -1 , max = Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++ ){
            if(itemSize<=capacity[i] && max>capacity[i])
              { 
                max = capacity[i];
                index = i;
              }
             
        }
         return index;
    }
}