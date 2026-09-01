public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            if (arr[i] == 0) {

                // Shift elements to the right
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }

                // Duplicate zero
                if (i + 1 < arr.length) {
                    arr[i + 1] = 0;
                }

                i += 2;

            } else {
                i++;
            }
        }
    }

}
