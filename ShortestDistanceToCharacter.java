public class ShortestDistanceToCharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int prev = -n;

        // Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }

            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE;

        // Right to left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }

            if (prev != Integer.MAX_VALUE) {
                ans[i] = Math.min(ans[i], prev - i);
            }
        }

        return ans;
    }
}
