class Solution {
    public int[] scoreValidator(String[] events) {
        
        int score=0;
        int counter=0;
        for(String s: events)
        {
            if(counter==10) break;

            if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6"))
            {
                score+=Integer.parseInt(s);
            }
            else if(s.equals("W")) 
            {
                counter++;
            }
            else if(s.equals("WD") || s.equals("NB"))
            {
                score++;
            }
        }
        return new int[]{score,counter};
    }
}