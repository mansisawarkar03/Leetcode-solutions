class Solution {
    public int mostWordsFound(String[] sentences) {
        // int max=0;
        
        // for(int i=0;i<sentences.length;i++)
        // {
        //     int count=0;
            
        //     String s=sentences[i];
        //     int n=s.length();
        //     int j=0;
        //     while(j<n)
        //     {
        //         if(s.charAt(j)==' ')
        //         {
        //             count++;
        //         }
        //         max=Math.max(max,count);
        //         j++;
        //     }

        // }
        // return max+1;
        int ans=0;
        for(String s: sentences)
        {
            String[] a=s.split(" ");
            ans=Math.max(ans,a.length);

        }
        return ans;

    }
}