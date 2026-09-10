class Solution {
    public int lengthOfLongestSubstring(String s) {

        // int[] hash=new int[256];
        // Arrays.fill(hash,-1);
        // int l=0;
        // int r=0;
        // int n=s.length();
        // int maxlen=0;
        // while(r<n)
        // {
        //     if(hash[s.charAt(r)]>=l)
        //         l=hash[s.charAt(r)]+1;

        //     int len=r-l+1;
        //     maxlen=Math.max(len,maxlen);
        //     hash[s.charAt(r)]=r;
        //     r++;

        // }
        // return maxlen;


        int left=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(right));
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}