class Solution {
    public String[] findWords(String[] words) {

        HashMap<Character,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        

        map.put('q',1);
        map.put('w',1);
        map.put('e',1);
        map.put('r',1);
        map.put('t',1);
        map.put('y',1);
        map.put('u',1);
        map.put('i',1);
        map.put('o',1);
        map.put('p',1);

        map.put('a',2);
        map.put('s',2);
        map.put('d',2);
        map.put('f',2);
        map.put('g',2);
        map.put('h',2);
        map.put('j',2);
        map.put('k',2);
        map.put('l',2);

        map.put('z',3);
        map.put('x',3);
        map.put('c',3);
        map.put('v',3);
        map.put('b',3);
        map.put('n',3);
        map.put('m',3);
        int flag=0;
        for(String s: words)
        {
            int j=map.get(Character.toLowerCase(s.charAt(0)));
            for(char ch: s.toCharArray())
            {
                flag=0;
                int i=map.get(Character.toLowerCase(ch));
                if(j!=i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                list.add(s);
            }
            
        }

        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}