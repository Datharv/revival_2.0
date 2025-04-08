class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = nums.length - 1;

        for(int i = 0;i<=j;i++) {
            if(nums[i] == val) {
                if(nums[j] == val) {
                    i--;
                    j--;
                }else{
                    nums[i] = nums[j];
                    j--;
                }
            }
        }
        return j+1;

    }
}
