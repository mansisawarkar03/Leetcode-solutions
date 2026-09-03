class Solution {
    public int countGoodSubstrings(String s) {
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++)
        {
            if(right-left+1 == 3)
            {
                String m=s.substring(left,right+1);
                if(isUnique(m))
                {
                    count++;
                }
                left++;
            }
        }

        return count;
        
    }

    public boolean isUnique(String m)
    {
        HashSet<Character> set=new HashSet<>();
        for(char ch: m.toCharArray())
        {
            set.add(ch);
        }
        if(set.size()==m.length())
        {
            return true;
        }
        return false;
    }
}