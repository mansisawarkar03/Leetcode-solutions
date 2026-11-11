class Solution {
    public String capitalizeTitle(String title) {
        
        String[] arr=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s: arr)
        {
            if(s.length()<3)
            {
                sb.append(s.toLowerCase());
            }
            else
            {
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1).toLowerCase());
            }
            sb.append(" ");
        } 
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}