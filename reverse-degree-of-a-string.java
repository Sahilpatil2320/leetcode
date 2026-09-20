class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            // Reverse alphabet position
            int reversePosition = 'z' - s.charAt(i) + 1;

            // String position is i + 1
            sum += reversePosition * (i + 1);
        }

        return sum;
    }
}