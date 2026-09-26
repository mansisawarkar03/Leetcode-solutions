class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        StringBuilder ans=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(List<String> l:knowledge)
        {
            map.put(l.get(0),l.get(1));
        }
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                i++;
                StringBuilder sb=new StringBuilder();
                int flag=0;
                while(s.charAt(i)!=')')
                {
                    sb.append(s.charAt(i));
                    i++;
                }
                
                if(map.containsKey(sb.toString()))
                {
                    ans.append(map.get(sb.toString()));
                }
                else
                {
                    ans.append("?");
                }
            }
            else
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
}