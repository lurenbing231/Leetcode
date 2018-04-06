package offer;

import java.util.HashMap;

public class RepeatNumbers {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (hashMap.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                hashMap.put(numbers[i], i);
            }
        }
        return false;
    }
}
