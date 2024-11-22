public class InsertionSort {
    public static void main(String[] args){
        int[] a = {5, 2, 4, 6, 1, 3};

        
        for (int i = 1; i < a.length; i++) { 
            int key = a[i];
            int j = i - 1;

            
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }

        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
