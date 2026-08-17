class Solution {
    public int secondLargestElement(int[] nums)
    {
        int largest=nums[0];
        int seclargest=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                seclargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]>seclargest)
            {
                seclargest=nums[i];
            }
        }
        return seclargest;
    }
}
