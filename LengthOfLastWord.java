class Solution {
    public int LengthOfLastWord(String s) {
        String words [] = s.split(" ");
        String lastWord = words[words.length - 1];
        int length = lastWord.length();

        return length;
        
    }
}