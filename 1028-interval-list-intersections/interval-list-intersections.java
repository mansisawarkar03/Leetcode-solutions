class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0;
        int j=0;
        List<int[]> ans=new ArrayList<>();
        while(i<firstList.length && j<secondList.length)
        {
            int start=Math.max(firstList[i][0],secondList[j][0]);
            int end=Math.min(firstList[i][1],secondList[j][1]);

            if(start<=end)
            {
                // List<Integer> m=new ArrayList<>();
                // m.add(start);
                // m.add(end);
                // l.add(m);
                ans.add(new int[]{start,end});
            }

            if(firstList[i][1]<secondList[j][1])
            {
                i++;
            }
            else
            {
                j++;
            }
        } 

        // int[][] ans=new int[l.size()][2];

        // for(int k=0;k<l.size();k++)
        // {
        //     for(int o=0;o<2;o++)
        //     {
        //         ans[k][o]=l.get(k).get(o);
        //     }
        // } 

        // return ans; 

        return ans.toArray(new int[ans.size()][]);
        
    }
}