class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            if(i==arr.length-1)
            {
                return s.charAt(s.length()-1)==arr[0].charAt(0);
            }
            if(s.charAt(s.length()-1)!= arr[i+1].charAt(0))
            {
                return false;
            }
        }
        return true;
        
    }
}