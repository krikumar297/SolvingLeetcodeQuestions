import java.util.Arrays;

public class RemoveDuplicateFromShortedArray {
    public static void main(String[] args) {
        //int [] array = new int[10];
        int [] array = {1,2,3,5,1,2,3,21,5,4,2,1,6,3,5,4,12,4,2};
        Arrays.sort(array);
    }

    public int removeDuplicates(int [] nums){
        int lastUniqueIndex = 0;

        for(int i = 1; i<nums.length; i++){
            if( nums[lastUniqueIndex] != nums[i]){
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex++;
            }
        }
        return lastUniqueIndex + 1;
    }
}

