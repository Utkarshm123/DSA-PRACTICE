class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // Edge case: not enough flowers
        if ((long)m * k > n) return -1;

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        // Find min and max bloom days
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        // Binary search on days
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                right = mid; // try smaller day
            } else {
                left = mid + 1; // need more days
            }
        }

        return left;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int d : bloomDay) {
            if (d <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}