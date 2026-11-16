class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer> map=new HashMap<>();
        for(char ch:num.toCharArray())
        {
            map.put(ch-'0', map.getOrDefault(ch-'0',0)+1);
        }
        for(int i=0;i<num.length();i++)
        {
            int d=num.charAt(i)-'0';
            int f=map.getOrDefault(i,0);
            if(f!=d) return false;
        }
        return true;
        
    }
}