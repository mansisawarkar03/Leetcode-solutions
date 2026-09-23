class Solution {
    public int maxArea(int[] height) {

        int left=0;
        int right=height.length-1;
        int ans=0;


        while(left<right)
        {

            int a=Math.min(height[right],height[left])*(right-left);
            ans=Math.max(ans,a);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }
        return ans;
        
    }
}