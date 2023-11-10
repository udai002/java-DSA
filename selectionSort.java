public class selectionSort {

    // selection sort -- it is sorting of element using a variable smallest and
    // comparing smallest element to all other element , if there is a smallest
    // elemnt fixing it as a smallest elemnt and fixing it to first one by one .
    public static void main(String[] args) {
        int[] arr = { 8, 4, 3, 2, 6, 4, 1 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }

                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;

            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
