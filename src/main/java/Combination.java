public class Combination {
    public static void combination(int[] temp, int start, int end, int index, int k) {

        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= k - index; i++ ) {
            temp[index] = i;
            combination(temp, i + 1, end, index + 1, k);
        }
    }

    public static void printCombination(int n, int k) {

        // temporary array to store combinations
        int[] temp = new int[k];

        combination(temp, 1, n, 0, k);
    }
}
