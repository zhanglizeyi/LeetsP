import static java.lang.System.*;

public class NumArray {
    private int[] numArray;
    
    public NumArray(int[] nums) {
        numArray = nums;
    }

    public int sumRange(int i, int j) {
        int result = 0;
        if(i >= 0 && j < numArray.length){
            for(int x = i; x <= j; x++){
                result += numArray[x];
            }
        }    
         return result;
    }

    //not work in static 
    public static void main(String[] args){
        //crete an int array
        int[] array = new int[] {1,2,3,4,5};

        //create instance of NumArray
        NumArray test = new NumArray(array);
        //test.NumArray(array);
        test.sumRange(0,3);

        out.println("output -> "+test.sumRange(0,3));
    }
}