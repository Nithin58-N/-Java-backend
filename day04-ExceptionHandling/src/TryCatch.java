 import java.util.Arrays;

public class  TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero.");
        }

        int [] nums = {10, 20, 30, 40, 50};
        System.out.println(nums[4]);
        try{
            System.out.println(nums[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:"+e.getMessage());
        }
        System.out.println("Program continues normally.");
    }
}
