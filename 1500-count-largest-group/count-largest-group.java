class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int m=i;
            int sum=0;
            while(m>0)
            {
                int d=m%10;
                sum+=d;
                m=m/10;
            }
            if(!map.containsKey(sum))
            {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }
        int max=Integer.MIN_VALUE;
        for(List<Integer> e:map.values())
        {
            max=Math.max(max,e.size());
        }
        int ans=0;
        for(List<Integer> e:map.values())
        {
           if(e.size()==max)
           {
                ans++;
           }
        }
        return ans;
        
    }
}