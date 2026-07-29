class Solution {
    public String addBinary(String a, String b) {
        

        
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0)
        {

            char ch1 = (i >= 0) ? a.charAt(i) : '0';
            char ch2 = (j >= 0) ? b.charAt(j) : '0';

            if(ch1!=ch2)
            {
                if(carry==1)
                {
                    sb.append("0");
                    carry=1;
                }
                else
                {
                    sb.append("1");
                    carry=0;
                }

            }
            else if(ch1=='0' && ch2=='0')
            {
                if(carry==1)
                {
                    sb.append("1");
                    carry=0;
                }
                else
                {
                    sb.append("0");
                    carry=0;
                }
            }
            else
            {
                if(carry==1)
                {
                    sb.append("1");
                    carry=1;
                }
                else
                {
                    sb.append("0");
                    carry=1;
                }
            }
            i--;
            j--;
            
        }
        if(carry==1)
            sb.append(1);

        return sb.reverse().toString();
    }
}