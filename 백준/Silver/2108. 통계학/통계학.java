import java.io.*;
import java.util.*;

public class Main {
    public static int mean(int[] nums) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        int answer = (int)Math.round((double)sum / size);
        return answer;
    }
    public static int midean(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        if (size % 2 == 1) {
            return nums[size / 2];
        } else {
            int a = nums[(size / 2) - 1];
            int b = nums[size / 2];
            return (a + b) / 2;
        }
    }
    public static int mode(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                int x = numMap.get(nums[i]);
                numMap.put(nums[i], x+1);
            } else {
                numMap.put(nums[i], 1);
            }
        }
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);
        if (modes.size() == 1) {
            return modes.get(0);
        } else {
            return modes.get(1);
        }
    }
    public static int range(int[] nums) {
        Arrays.sort(nums);
        return Math.abs(nums[nums.length-1] - nums[0]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(mean(nums));
        System.out.println(midean(nums));
        System.out.println(mode(nums));
        System.out.println(range(nums));
    }
}
