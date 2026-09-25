class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();

        int n=p.length();
        int[] s1=new int[26];
        int[] p1=new int[26];
        for(char ch: p.toCharArray())
        {
            p1[ch-'a']++;
        }
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            s1[s.charAt(i)-'a']++;
            if(i-l+1==n)
            {
                if(Arrays.equals(s1,p1))
                {
                    ans.add(l);
                }
                s1[s.charAt(l)-'a']--;
                l++;
            }
        }

        return ans;
        
    }
}