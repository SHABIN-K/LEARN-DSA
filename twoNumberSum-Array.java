import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int[] twoNumberSum(int [] array, int target){

        //first method
        //Time Complexity  : n(n^2)
        //Space Complexity : n(1)
        //for(int i = 0; i < array.length-1; i++){
        //    for (int j = i+1; j < array.length; j++) {
        //        if (array[i] + array[j] == target) {
        //            return new int[]{array[i],array[j]};
        //        }
        //    }
        //}
        //return new int[0];

        //second method
        //Time Complexity  : n(n)
        //Space Complexity : n(n)

        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int match = target - num;
            if(nums.contains(match))  {
               return new int[]{num, match};
            } else {
                nums.add(num);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {6,5,7,9,4,0,2};
        int target = 10;
        int[] result = twoNumberSum( array, target);
        System.out.println("result is :");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
