class Solution {
    public int minimumFlips(int n) {

        String s=Integer.toBinaryString(n);
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=(int)s.charAt(i)-'0';
        }
        int[] rev=Arrays.copyOf(arr,arr.length);
        int left=0;
        int right=rev.length-1;
        while(left<right)
        {
            int temp=rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]^rev[i])==1) ans++;
        }
        return ans;
        
    }
}