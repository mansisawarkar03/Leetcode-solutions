class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> unique=new HashSet<>();
        int index=0;

        for(int i=0;i<nums.length;i++)
        {
            if(!unique.contains(nums[i]))
            {
                unique.add(nums[i]);
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}