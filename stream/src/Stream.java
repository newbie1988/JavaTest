import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static int calc(int number) {
        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2 * number;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 6, 98, 25, 88);
        for(int num : nums) {
            if(num > 10 && num % 2 == 0) {
                System.out.println("result is " + num);
                break;
            }
        }

        System.out.println(nums.stream().filter(e->e > 10)
                                        .filter(e->e%2== 0)
                                        .findFirst()
                                        .map(e->"the result is " + e));

        long start = System.nanoTime();
        nums.stream().map(Stream::calc)
                     .forEachOrdered(System.out::println);
        double costTime = (System.nanoTime() - start) / 1e9;
        System.out.printf("serialization cost time %fs", costTime);

        start = System.nanoTime();
        nums.stream().parallel()
                     .map(Stream::calc)
                     .forEachOrdered(System.out::println);
        costTime = (System.nanoTime() - start) / 1e9;
        System.out.printf("parallel cost time %fs", costTime);
    }
}
