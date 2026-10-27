class Solution {
    public String generateTag(String caption) {
        StringBuilder sb=new StringBuilder();
        sb.append("#");
        boolean neww=false;

        for(int i=0;i<caption.length();i++)
        {
            char ch=caption.charAt(i);
            if(ch==' ')
            {
                neww=true;
                continue;
            }
            if(sb.length()==1) sb.append(Character.toLowerCase(ch));
            else if(neww) sb.append(Character.toUpperCase(ch));
            else sb.append(Character.toLowerCase(ch));

            neww =false;
            if(sb.length()==100)
            {
                break;
            }
        }
        return sb.toString();
        
    }
}