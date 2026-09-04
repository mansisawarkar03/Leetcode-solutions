class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
    
        List<String> list=new ArrayList<>();
        int i=0;

        while(i<words.length)
        {
            int j=i;
            int letters=0;

            while(j<words.length && letters+words[j].length()+(j-i)<=maxWidth)
            {
                letters+=words[j].length();
                j++;
            }

            int wordCount=j-i;
            int spaces=maxWidth-letters;
            StringBuilder sb=new StringBuilder();

            if(j==words.length || wordCount==1)
            {
                for(int k=i;k<j;k++)
                {
                    sb.append(words[k]);
                    if(k != j-1)
                    {
                        sb.append(" ");
                    }
                }
                while(sb.length()<maxWidth)
                {
                    sb.append(" ");
                }
            }
            else
            {
                int gaps=spaces /(wordCount-1);
                int extra=spaces %(wordCount-1);
                for(int k=i;k<j;k++)
                {
                    sb.append(words[k]);
                    if(k != j-1)
                    {
                        for(int x=0;x<gaps;x++)
                        {
                            sb.append(" ");
                        }
                        if(extra>0)
                        {
                            sb.append(" ");
                            extra--;
                        }
                    }
                }
            }
            list.add(sb.toString());
            i=j;
        }

        return list;

    }
}