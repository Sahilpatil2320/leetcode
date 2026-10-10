import java.util.*;

class MinimumSumOfSquaredDifference {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        long operations = (long) k1 + k2;

        for (int i = 0; i < nums1.length; i++) {
            pq.offer(Math.abs(nums1[i] - nums2[i]));
        }

        while (operations > 0 && !pq.isEmpty()) {
            int max = pq.poll();

            if (max == 0) {
                break;
            }

            pq.offer(max - 1);
            operations--;
        }

        long sum = 0;

        while (!pq.isEmpty()) {
            long diff = pq.poll();
            sum += diff * diff;
        }

        return sum;
    }
}