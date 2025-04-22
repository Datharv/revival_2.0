class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        
        int n = values.length;
        boolean [] visited = new boolean[n];
        int index = 0;

        long ans = 0;
        while(index >= 0 && index < n && !visited[index]){
            visited[index] = true;
            if(instructions[index].charAt(0) == 'a'){
                ans += values[index];
                index++;
            }else{
                index = index + values[index];
            }
            
        }

        return ans;
    }
}
