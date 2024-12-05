package STACKS.ASSIGNMENT;

import java.util.Stack;

public class _4 {
    public static int stored(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > left[i - 1]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i - 1];
            }
        }

        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > right[i + 1]) {
                right[i] = arr[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        int waterCapacity = 0;
        for (int i = 0; i < arr.length; i++) {
            waterCapacity += (Math.min(right[i], left[i]) - arr[i]) * arr[i];
        }
        return waterCapacity;
    }

    public static int stored2(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        s.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            if (curr > s.peek()) {
                s.push(curr);
            }
            left[i] = s.peek();
        }

        right[arr.length - 1] = arr[arr.length - 1];
        s.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            int curr = arr[i];
            if (curr > s.peek()) {
                s.push(curr);
            }
            right[i] = s.peek();
        }

        int waterCapacity = 0;
        for (int i = 0; i < arr.length; i++) {
            waterCapacity += (Math.min(right[i], left[i]) - arr[i]) * arr[i];
        }
        return waterCapacity;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
        System.out.println(stored2(arr));
        ;
    }
}
