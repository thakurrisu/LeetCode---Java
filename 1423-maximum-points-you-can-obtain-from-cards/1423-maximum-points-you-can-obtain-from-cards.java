class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // int i=0 , j =cardPoints.length-1;
        // int sum = 0;
        // while(i<=j && k>0){
        //         if(cardPoints[i]<cardPoints[j])
        //             { 
        //                 sum += cardPoints[j];
        //                 j--;
        //             }
        //         else
        //            {
        //             sum += cardPoints[i];
        //             i++;
        //            }
        //            k--;
        // }

        int left_sum = 0;
        for(int i =0 ;i <k; i ++)
            left_sum += cardPoints[i];
        int sum = left_sum;
        int right_sum = 0 , j = cardPoints.length-1 , i=k-1;
        for( i = k-1 ;i>=0;i--){
            left_sum -= cardPoints[i];
            right_sum += cardPoints[j];
          
            j--;
            System.out.println(left_sum +" " + " " +right_sum +" " +i +" " +j);
            sum = Math.max(sum , left_sum + right_sum);
        }
        return sum;
    }
}