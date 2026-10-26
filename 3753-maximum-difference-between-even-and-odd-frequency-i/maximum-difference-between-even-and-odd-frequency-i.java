class Solution {
    public int maxDifference(String s) {
        int[] arr=new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']++;
        }
        int maxe=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        int maxo=Integer.MIN_VALUE;
        int mino=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0) continue;
            if(arr[i]%2==0)
            {
                //maxe=Math.max(maxe,arr[i]);
                mine=Math.min(mine,arr[i]);
            }
            else
            {
                maxo=Math.max(maxo,arr[i]);
                //mino=Math.min(mino,arr[i]);
            }
        }

        //return Math.max(maxe-mino,maxo-mine);
        return maxo-mine;
        
    }
}