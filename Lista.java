import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] M1 = {1, 3, 5, 7};
        int[] M2 = {0, 2, 4, 6};
        int x = M1.length;
        int y = M2.length;

        int[] result = new int[x + y];
        System.arraycopy(M1, 0, result, 0, x);
        System.arraycopy(M2, 0, result, x, y);
        Arrays.sort(result);

        System.arraycopy(result, 0, M1, 0, x);
        System.arraycopy(result, x, M2, 0, y);

        System.out.println("M1: " + Arrays.toString(M1));
        System.out.println("M2: " + Arrays.toString(M2));
    }
}
