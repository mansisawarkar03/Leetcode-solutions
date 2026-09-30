class Solution {
    public int firstUniqueEven(int[] nums) {

        // Map<Integer,Integer> map=new LinkedHashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }

        // int ans=-1;
        // for(Map.Entry<Integer,Integer> entry: map.entrySet())
        // {
        //     if(entry.getValue()==1 && entry.getKey()%2==0)
        //     {
        //         return entry.getKey();
        //     }
        // }
        // return ans;
        

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    return nums[i];
                }
            
            }
            
        }
        return -1;
    }
}