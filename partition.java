import java.util.Arrays;
import java.util.Collections;

class partition {

    public static void main(String[] args) {
        int[] nums = { 1, 11, 3, 7 };
        Arrays.sort(nums);
        System.out.println("Nums ascending order is " + Arrays.toString(nums));

        int sum = 0;

        int index = getIndex(nums, 0);
        System.out.println("Index is " + index);
    }

    public static int getIndex(int[] arr, int i) {

        int index = 0;

        if (calcSum(arr, 0, i) < calcSum(arr, i + 1, arr.length - 1) && i < arr.length) {
            getIndex(arr, i + 1);
        } else if (calcSum(arr, 0, i) == calcSum(arr, 0, arr.length - 1) && i < arr.length) {
            index = i - 1;
        } else {
            index = i;
        }
        return index;
    }

    public static int calcSum(int[] arr, int i, int j) {
        int sum = 0;
        System.out.println("i is " + i);
        System.out.println("j is " + j);
        for (int p = 0; p <= j; p++) {
            sum = sum + arr[p];
        }
        System.out.println("Sum is " + sum);
        return sum;
    }
}