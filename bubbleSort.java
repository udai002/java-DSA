public class bubbleSort {

    //bubble Sort we have to compare two element in arr and if first element is greater then we have to swap it .
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 6, 8, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
