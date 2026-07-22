class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int studIndex=0;
        int cookieIndex=0;

        while(studIndex<g.length && cookieIndex<s.length)
        {
            if(s[cookieIndex]>=g[studIndex])
                studIndex++;

            cookieIndex++;
        }
        return studIndex;
        
    }
}