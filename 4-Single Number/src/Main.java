import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {4,1,2,1,2};
        System.out.println(singleNumber(numbers));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums){
            result ^= num;
        }
        return result;
    }
}