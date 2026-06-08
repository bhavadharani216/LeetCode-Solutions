class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        // Try all possible first and second numbers
        for (int i = 1; i <= n / 2; i++) {

            // First number cannot have leading zeros
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }

            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {

                // Second number cannot have leading zeros
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }

                long first = Long.parseLong(num.substring(0, i));
                long second = Long.parseLong(num.substring(i, i + j));

                if (isValid(first, second, i + j, num)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValid(long first, long second, int start, String num) {

        while (start < num.length()) {

            long sum = first + second;
            String sumStr = String.valueOf(sum);

            // Check if remaining string starts with expected sum
            if (!num.startsWith(sumStr, start)) {
                return false;
            }

            start += sumStr.length();

            first = second;
            second = sum;
        }

        return true;
    }
}
