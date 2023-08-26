public class Main {
    //second method
    //Time Complexity  : n(n)
    //Space Complexity : n(1)
    public static int[] sortArray(int[] array, int key) {
        int n = array.length;
        int j = n - 1; // Index to place occurrences of key

        for (int i = 0; i <= j; i++) {
            if (array[i] == key) {
                // Swap the current element with the element at index j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j--;
                i--; // Recheck the swapped element
            }
        }

        return array;
    }
   //first method
   //Time Complexity  : n(n^2)
   //Space Complexity : n(1)
   //public static int[] sortArray(int[] array, int key) {
   //    int j = array.length - 1;
   //    for (int i = 0; i < j; i++) {
   //        if (array[i] == key && i < j) {
   //            while (array[j] == key && i < j) {
   //                j--;
   //            }
   //            int temp = array[i];
   //            array[i] = array[j];
   //            array[j] = temp;
   //        }
   //    }
   //    return array;
   //}
    public static void main(String[] args) {
        int[] array = {6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6};
        int key = 6;
        int[] result = sortArray(array, key);

        System.out.println("result is:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ,");
        }
    }
}
