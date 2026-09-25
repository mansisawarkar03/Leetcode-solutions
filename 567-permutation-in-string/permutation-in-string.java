class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n=s1.length();
        // char[] c1=s1.toCharArray();
        // Arrays.sort(c1);
        // char[] c2=s2.toCharArray();
        // Arrays.sort(c2);
        int l=0;
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            c1[ch-'a']++;
        }

        for(int i=0;i<s2.length();i++)
        {
            c2[s2.charAt(i)-'a']++;
            if(i-l+1==n)
            {
                if(Arrays.equals(c1,c2))
                {
                    return true;
                }
                c2[s2.charAt(l)-'a']--;
                l++;
            }

        }
        return false;
    }
}