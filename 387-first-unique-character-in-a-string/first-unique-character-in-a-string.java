class Solution {
    public int firstUniqChar(String s) {

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int flag = 0;

            for(int j = 0; j < s.length(); j++) {
                if(i != j && ch == s.charAt(j)) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
                return i;
        }

        return -1;
    }
}