class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();

        int right = -1;

        // Find first occurrence of ch
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                right = i;
                break;
            }
        }

        // ch not found
        if (right == -1) {
            return word;
        }

        int left = 0;

        // Reverse prefix
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}