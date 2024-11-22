import java.util.*;

public class Sorting {
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini])
                    mini = j;
            }

            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSortedArray(int[] nums, int start, int mid, int end) {
        // ArrayList to store the sorted elements temporarily
        ArrayList<Integer> ans = new ArrayList<>();

        int ptr1 = start;
        int ptr2 = mid + 1;

        while (ptr1 <= mid && ptr2 <= end) {
            if (nums[ptr1] < nums[ptr2]) {
                ans.add(nums[ptr1++]);
            } else {
                ans.add(nums[ptr2++]);
            }
        }

        while (ptr1 <= mid) {
            ans.add(nums[ptr1++]);
        }

        while (ptr2 <= end) {
            ans.add(nums[ptr2++]);
        }

        // Copy sorted elements back to the original array
        for (int i = start; i <= end; i++) {
            nums[i] = ans.get(i - start);
        }
    }

    static void solveMergeSort(int[] nums, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        // Solve for left part
        solveMergeSort(nums, start, mid);

        // Solve for right part
        solveMergeSort(nums, mid + 1, end);

        mergeSortedArray(nums, start, mid, end);
    }

    static void mergeSort(int[] nums, int n) {
        int start = 0, end = n - 1;
        solveMergeSort(nums, start, end);

        System.out.println("After Merge sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    static int findPivotIndex(int[] nums, int start, int end) {
        int pivot = nums[start];

        int i = start;
        int j = end;

        while (i < j) {
            while (i <= end && nums[i] <= pivot) {
                i++;
            }

            while (j >= start && nums[j] > pivot) {
                j--;
            }

            if (i < j) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap nums[start] and nums[j] to place the pivot in its correct position
        int temp = nums[start];
        nums[start] = nums[j];
        nums[j] = temp;

        return j;
    }

    static void solveQuickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = findPivotIndex(nums, start, end);

        // Sort left and right partitions
        solveQuickSort(nums, start, pivotIndex - 1);
        solveQuickSort(nums, pivotIndex + 1, end);
    }

    static void quickSort(int[] nums, int n) {
        int start = 0, end = n - 1;
        solveQuickSort(nums, start, end);

        System.out.println("After Quick sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number of integers must be greater than zero.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // selectionSort(arr, n);
        // bubbleSort(arr, n);
        // insertionSort(arr, n);
        // mergeSort(arr, n);
        quickSort(arr, n);

        scanner.close();
    }
}