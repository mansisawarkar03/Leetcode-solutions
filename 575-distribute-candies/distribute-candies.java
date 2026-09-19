class Solution {
    public int distributeCandies(int[] candyType) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:candyType)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int n=candyType.length/2;
        if(n<=map.size())
        {
            return n;
        }
        else if(n>map.size())
        {
            map.size();
        }
        
        return map.size();
        
    }
}