class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr=new int[26];
        for(char ch:allowed.toCharArray())
        {
            arr[ch-'a']=1;
        }
        int ans=0;
        for(String s:words)
        {
            int flag=0;
            for(char ch: s.toCharArray())
            {
                if(arr[ch-'a']==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0) ans++;
        }
        return ans;
    }
}