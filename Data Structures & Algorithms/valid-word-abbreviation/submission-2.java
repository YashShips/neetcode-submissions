class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
       int i = 0, j = 0;
       while(i < word.length() && j < word.length()){
        char ac = abbr.charAt(j), wc = word.charAt(i);
        if(Character.isDigit(ac)){
            if(ac == '0') return false;
            int curr = 0;
            while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                curr = curr * 10 + abbr.charAt(j) - '0';
                j++;
            }
            i = i + curr;
        }
        else{
            if(ac != wc) return false;
            else{
                i++;
                j++;
            }
        }
      }
      return i == word.length() && j == abbr.length();
    }
}