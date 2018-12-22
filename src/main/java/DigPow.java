import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigPow {
    public static long digPow(int n, int p) {
        Long poweredNumber = calculatePow(n, p);
        long result = -1L;
        p = 1;
        while (true) {
            long toTest = (long)n * (long)p;
            p++;
            if ( toTest > poweredNumber) {
                break;
            }
            if (toTest == poweredNumber) {
                result = --p;
                break;
            }
        }

        return result;
    }

    private static Long calculatePow(Integer n, Integer p) {
        List<Integer> digitsOfN = new ArrayList<>();
        while (Math.abs(n) > 0) {
            digitsOfN.add(n % 10);
            n = n / 10;
        }
        long result = 0L;
        Collections.reverse(digitsOfN);
        for (Integer inte : digitsOfN) {
            result += ((Double) (Math.pow(inte.doubleValue(), p.doubleValue()))).longValue();
            p++;
        }
        return result;
    }
}
