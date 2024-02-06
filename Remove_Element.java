class Solution {
    public int removeElement(int[] nums, int val) {
        //we need toplace the correct element at start of array only

        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
        
    }
}