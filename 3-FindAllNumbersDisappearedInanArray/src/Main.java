import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(numbers));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
     //First Remove Duplicate
        HashSet<Integer> set = new HashSet<>();
        List<Integer> missing = new ArrayList<>();

        for (int n : nums) {
            set.add(n);
        }


        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }
}