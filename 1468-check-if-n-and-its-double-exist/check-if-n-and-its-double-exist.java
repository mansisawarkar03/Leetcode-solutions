class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int r=arr[i]*2;
            
            if(map.containsKey(r))
            {
                return true;
            }
            if(arr[i]%2==0)
            {
                int r1=arr[i]/2;
                if(map.containsKey(r1))
                {
                    return true;
                }
            }
            map.put(arr[i],i);
        }
        return false;
    }
}