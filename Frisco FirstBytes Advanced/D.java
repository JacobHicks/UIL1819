import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String[] unparsed = in.nextLine().split(" ");
            BigInteger[] nums = new BigInteger[unparsed.length];
            BigInteger max = BigInteger.ZERO;
            for(int i = 0; i < nums.length; i++) {
                nums[i] = new BigInteger(unparsed[i]);
                if(nums[i].compareTo(max) > 0) max = nums[i];
            }
            boolean ez = true;
            for(BigInteger n : nums) {
                if(!max.mod(n).equals(BigInteger.ZERO)) {
                    ez = false;
                    break;
                }
            }
            if(ez) System.out.println(max);
            else {
                BigInteger res = BigInteger.ONE;
                for(BigInteger n : nums) res = res.multiply(n);
                System.out.println(res);
            }

        }
    }
}
