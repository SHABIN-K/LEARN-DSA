public class Main {
    public static int[] sortArray(int[] array, int key) {
        int j = array.length - 1;
        for (int i = 0; i < j; i++) {
            if (array[i] == key && i < j) {
                while (array[j] == key && i < j) {
                    j--;
                }
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6};
        int key = 6;
        int[] result = sortArray(array, key);

        System.out.println("result is:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
