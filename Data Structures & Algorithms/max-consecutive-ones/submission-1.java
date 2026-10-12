class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int c =0;
            for(int j=i;j<n;j++){
                if(nums[j] == 0) break;
                c++;
            }
            res = Math.max(res,c);
        }
        return res;
        
    }
}