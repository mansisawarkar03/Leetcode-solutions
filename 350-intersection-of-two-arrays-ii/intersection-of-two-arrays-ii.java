class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // int i=0;
        // int j=0;

        List<Integer> list=new ArrayList<>();

        // while(i<nums1.length && j<nums2.length)
        // {
        //     if(nums1[i]==nums2[j])
        //     {
        //         list.add(nums1[i]);
        //         i++;
        //         j++;
        //     }

        // }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
            if(map.getOrDefault(nums2[i],0)==0)
            {
                map.remove(nums2[i]);
            }

        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int l:list)
        {
            ans[i]=l;
            i++;
        }

        return ans;
    }
}