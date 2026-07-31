class Solution {
    public int minimumPushes(String word) {

        int[] freq=new int[26];
        int push=1;
        int count=0;
        int ans=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        for(int i=25;i>=0;i--)
        {
            if(freq[i]==0) break;
            ans=ans+freq[i]*push;
            count++;
            if(count==8)
            {
                count=0;
                push++;
            }
        }
        return ans;


    }    
}