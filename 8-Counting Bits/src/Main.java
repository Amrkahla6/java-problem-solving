import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n){
        int [] result = new int[n + 1];
        result[0] = 0;

        for (int i=1; i <= n; i++){
            result[i] = result[i / 2] + (i % 2);
        }

        return result;
    }
}