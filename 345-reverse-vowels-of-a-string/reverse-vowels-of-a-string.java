class Solution {
    public String reverseVowels(String s) {

        List<Character> list=new ArrayList<>();

        for(char ch: s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                list.add(ch);
            }
        }

        int k=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                sb.setCharAt(i,list.get(k));
                k++;
            }
        }

        return sb.toString();
        
    }
}