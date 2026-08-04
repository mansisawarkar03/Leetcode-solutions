class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];

        int i=0;
        while(min<=max)
        {
            if(nums[i]!=min)
            {
                ans.add(min);
            }
            else
            {
                i++;
            }
            min++;
        }

        return ans;
        
    }
}