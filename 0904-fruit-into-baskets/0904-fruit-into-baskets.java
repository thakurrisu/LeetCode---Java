class Solution {
    public int totalFruit(int[] fruits) {
         HashMap<Integer,Integer> m = new HashMap<>();
        int i = 0 , j = 0 , n = fruits.length;
        int max = 0;
        while(j<n){
            if(!m.containsKey(fruits[j]) && m.size()>=2){
                    int first = fruits[i];
                    while(m.size()==2){
                        System.out.println(fruits[i]);
                        m.put(fruits[i],m.get(fruits[i])-1);
                        if(m.get(fruits[i]) == 0) m.remove(fruits[i]);
                        i++;
                        
                    }      
            }
            m.put(fruits[j],m.getOrDefault(fruits[j],0)+1);
            max = Math.max(max,j-i+1);
            j++;
            // int sum =0;
            // for(int val:m.values())
            //   sum += val;
           
        }
        return max;
    }
}