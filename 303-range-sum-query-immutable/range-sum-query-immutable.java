class NumArray {
    int[] n;

    public NumArray(int[] nums) {
        n=nums;
        
    }
    
    public int sumRange(int left, int right) {
        int[] p=new int[n.length];
        p[0]=n[0];
        for(int i=1;i<n.length;i++)
        {
            p[i]=n[i]+p[i-1];
        }
        if(left==0)
        {
            return p[right];
        }
        return p[right]-p[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */