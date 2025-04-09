class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) {
            int start = nums[i];
            int end = nums[i];
            for(int j = i+1;j<nums.length;j++) {
                if(nums[j]-1 == nums[j-1]) {
                    end = nums[j];
                    i = j;
                }else{
                    break;
                }
            }
            System.out.println("start : " + start + "end : " + end );
            StringBuilder sb = new StringBuilder();
            if(start == end) {
                sb.append(start);
            }else{
                sb.append(start);
                sb.append("->");
                sb.append(end);
            }
            
            res.add(sb.toString());
        }
        return res;
    }
}
