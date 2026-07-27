class Solution {
    public String reformatDate(String date) {

        HashMap<String,String> map=new HashMap<>();
        map.put("Oct","10");
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Nov","11");
        map.put("Dec","12");

        String[] parts=date.split(" ");
        String parts1="";
        if(parts[0].length()==3)
        {
            parts1="0"+parts[0].substring(0,parts[0].length()-2);
        }
        else
        {
            parts1=parts[0].substring(0,parts[0].length()-2);
        }

        String ans=parts[2]+"-"+ map.get(parts[1]) + "-" +parts1;

        return ans;
        
    }
}