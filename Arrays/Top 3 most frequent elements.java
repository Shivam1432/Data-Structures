import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 2, 3, 3, 3, 4, 4, 4, 4);

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Min Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > 3) {
                minHeap.poll(); // remove least frequent
            }
        }

        // Extract top 3
        List<Integer> top3 = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            top3.add(minHeap.poll().getKey());
        }

        // Reverse to get most frequent first
        Collections.reverse(top3);
        System.out.println("Top 3 frequent elements: " + top3);
    }
}
