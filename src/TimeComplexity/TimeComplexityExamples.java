package TimeComplexity;

public class TimeComplexityExamples {

    // O(1) - Constant Time
    public static void constantTime(int[] arr) {
        System.out.println("O(1) Example:");
        if (arr.length > 0)
            System.out.println("First element: " + arr[0]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        constantTime(arr);
    }
}