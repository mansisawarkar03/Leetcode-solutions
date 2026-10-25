class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        int start=convert(startTime);
        int end=convert(endTime);

        return end -start;

        
    }
    int convert(String time)
    {
        int h=Integer.parseInt(time.substring(0,2));
        int m=Integer.parseInt(time.substring(3,5));
        int s=Integer.parseInt(time.substring(6));

        return h*60*60 + m*60 +s;
    }
}