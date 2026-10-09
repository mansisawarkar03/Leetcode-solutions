class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                open++;
            }
            else {
                // If the next character is not ')',
                // insert one ')' to complete the pair.
                if(i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                }
                else {
                    insertions++;
                }

                // This closing pair needs an opening '('.
                if(open > 0) {
                    open--;
                }
                else {
                    insertions++;
                }
            }
        }

        // Each unmatched '(' needs two closing brackets.
        insertions += open * 2;

        return insertions;
    }
}