class Largest_Element {
    public static int largestElement(int[] nums) {
        int largest=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(largestElement(arr));
    }
}