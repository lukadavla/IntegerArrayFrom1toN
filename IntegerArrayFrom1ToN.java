public class IntegerArrayFrom1ToN {
    public static void main(String[] args) {
        int n = 313;
        int[] result = generateArrayFrom1ToN(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateArrayFrom1ToN(int n) {
        if (n <= 0) {
            // Handle the case when n is not greater than 0
            return new int[0]; // Return an empty array
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }

        return result;
    }
}
