// 451. Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128]; // Assuming ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                char c = (char) i;
                for (int j = 0; j < freq[i]; j++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

}