class Solution {
    public String reverseByType(String s) {
        List<Character> sp=new ArrayList<>();
        List<Character> l=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') l.add(ch);
            else sp.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                sb.append(l.get(j));
                j++;
            }
            else
            {
                sb.append(sp.get(k));
                {
                    k++;
                }
            }
        }

        return sb.toString();
        
    }
}