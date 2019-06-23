import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int n = 1; in.hasNextLine(); n++) {
            int d1 = in.nextInt();
            int d2 = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0;
            for(int i = 1; i <= d1; i++) {
                for(int x = 1; x <= d2; x++) {
                    map.put(i + x, map.getOrDefault(i + x, 0) + 1);
                    max = Math.max(max, map.get(i + x));
                }
            }
            System.out.println("Test Case " + n);
            for(Integer i : map.keySet()) {
                if(map.get(i) == max) {
                    System.out.println(i);
                }
            }
        }
    }
}
