package offer;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) return false;
        return isLastTree(sequence, 0, sequence.length - 1);
    }

    private boolean isLastTree(int[] sequence, int start, int end) {
        if (start >= end) return true;
        int tmp = sequence[end];
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > tmp) break;
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < tmp) return false;
        }
        return isLastTree(sequence, start, i - 1) && isLastTree(sequence, i, end - 1);
    }
}
