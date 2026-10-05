class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] ans=new int[temperatures.length];
        // int n=temperatures.length;
        // for(int i=0;i<n;i++)
        // {
        //     int flag=0;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(temperatures[j]>temperatures[i])
        //         {
        //             ans[i]=j-i;
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0)
        //     {
        //         ans[i]=0;
        //     }
        // }
        // return ans;


       
        
        Stack<Integer> in=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!in.empty() && temperatures[in.peek()]<=temperatures[i])
            {
                
                in.pop();
            }
            if(!in.isEmpty())
            {
                ans[i]=in.peek()-i;
            }
            in.push(i);
           
        }
        
        return ans;
        
    }
}