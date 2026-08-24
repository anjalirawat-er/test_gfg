import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> sequence = new ArrayList<>();
        sequence.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = (long) Math.floor(Math.sqrt(n));
            } else {
                n = (long) Math.floor(n * Math.sqrt(n));
            }
            sequence.add(n);
        }

        return sequence;
    }
}