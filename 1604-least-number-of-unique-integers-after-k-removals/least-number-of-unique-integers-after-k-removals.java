class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:arr)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list,(a,b)->Integer.compare(a.getValue(),b.getValue()));
        // if(list.size()==k)
        // {
        //     return 0;
        // }
        int count=k;
        int u=list.size();
        for(int i=0;i<list.size();i++)
        {
            Map.Entry<Integer,Integer> entry=list.get(i);
            if(count>=entry.getValue())
            {
                count-=entry.getValue();
                u--;
            }
            else
            {
                break;
            }
            

        }
        return u;

        
    }
}