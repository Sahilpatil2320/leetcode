public class LexicographicallySmallestPermutationGreaterThanTarget {
    public String lexGreaterPermutation(String s, String target) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] ans = new char[target.length()];

        for (int i = 0; i < target.length(); i++) {

            int targetChar = target.charAt(i) - 'a';

            if (freq[targetChar] > 0) {

                ans[i] = target.charAt(i);
                freq[targetChar]--;

                continue;
            }

            for (int c = targetChar + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    ans[i] = (char) ('a' + c);
                    freq[c]--;

                    int index = i + 1;

                    for (int x = 0; x < 26; x++) {
                        while (freq[x] > 0) {
                            ans[index++] = (char) ('a' + x);
                            freq[x]--;
                        }
                    }

                    return new String(ans);
                }
            }

            break;
        }

        freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < target.length(); i++) {

            int current = target.charAt(i) - 'a';

            if (freq[current] > 0) {
                freq[current]--;
            } else {
                break;
            }

            for (int c = current + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    StringBuilder result = new StringBuilder();

                    result.append(target, 0, i);
                    result.append((char) ('a' + c));

                    freq[c]--;

                    for (int x = 0; x < 26; x++) {
                        while (freq[x] > 0) {
                            result.append((char) ('a' + x));
                            freq[x]--;
                        }
                    }

                    return result.toString();
                }
            }
        }

        return "";
    }
}
