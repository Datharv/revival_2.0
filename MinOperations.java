class Solution {
    public int minOperations(int[] nums, int k) {
        
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        
        int operations = 0;
        while(sum != 0){
            if(sum % k == 0)
                return operations;
            sum -= 1;
            operations++;
        }
        
        return operations;
    }
    

}
