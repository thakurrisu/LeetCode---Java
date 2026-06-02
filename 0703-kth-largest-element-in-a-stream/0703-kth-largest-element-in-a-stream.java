class KthLargest {
     private int size;
     private PriorityQueue<Integer> res = new PriorityQueue<Integer>();
    public KthLargest(int k, int[] nums) {
        this.size = k;
        for(int i : nums){
            res.offer(i);
            if(res.size()>size) res.poll();
           
        } 

    }
    
    public int add(int val) {
          res.offer(val);
        if(res.size()>size) res.poll();
         return res.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */