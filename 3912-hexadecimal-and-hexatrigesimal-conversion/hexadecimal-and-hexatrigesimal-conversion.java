class Solution {
    public String concatHex36(int n) {
        String d=Integer.toHexString(n*n).toUpperCase();
        String t=Integer.toString(n*n*n,36).toUpperCase();
        return d+t;
        
    }
}