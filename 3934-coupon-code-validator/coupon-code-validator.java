class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> ans=new ArrayList<>();
        List<String[]> arr=new ArrayList<>();
        int n=code.length;
        
        for(int i=0;i<n;i++)
        {
            int c=0;
            
            if(code[i]==null || code[i].isEmpty())
            {
                continue;
            }
            for(int j=0;j<code[i].length();j++)
            {
                char ch=code[i].charAt(j);
                if(!Character.isLetterOrDigit(ch) && ch!='_')
                {
                    c=1;
                    break;
                }
            }
            String s=businessLine[i];
            if(s.equals("electronics") || s.equals("grocery") || s.equals("pharmacy") || s.equals("restaurant"))
            {
                if(isActive[i] && c==0)
                {
                    arr.add(new String[]{code[i],s});
                }
            }
            
        }

        
        arr.sort(Comparator.comparing((String[] a)->a[1]).thenComparing(a->a[0]));

        for(String[] item:arr)
        {
            ans.add(item[0]);
        }
        return ans;

        
    }
}