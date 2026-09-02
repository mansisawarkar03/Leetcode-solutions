class Solution {
    public String oddString(String[] words) {
        List<int[]> l=new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            String s =words[i];
            int[] arr=new int[s.length()-1];
            for(int j=0;j<s.length()-1;j++)
            {
                char ch=s.charAt(j);
                
                arr[j]=((s.charAt(j+1)-'a')-(ch-'a'));
            }
            l.add(arr);

        }
        
        for(int i=0;i<l.size();i++)
        {
            int count=0; 
            for(int j=0;j<l.size();j++)
            {
                if(Arrays.equals(l.get(i),l.get(j)))
                {
                    count++;
                }
                
            }
            if(count==1)
            {
                return words[i];
            }
            
        }

        return " ";
        
    }
}


