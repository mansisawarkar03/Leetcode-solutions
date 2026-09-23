class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int ans=0;
        int n=people.length;
        int r=n-1;
        int l=0;
        Arrays.sort(people);
        while(l<=r)
        {
            if(l==r)
            {
                ans++;
                break;
            }
            if(people[l]+people[r]<=limit)
            {
                ans++;
                l++;
                r--;
            }
            else
            {
                ans++;
                r--;
            }
        }
        return ans;
        
    }
}