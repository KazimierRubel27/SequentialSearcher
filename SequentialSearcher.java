public class SequentialSearcher {

    // 2 point find algorithm
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 4 point even algorithm
    public static int[] even(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] onlyEven = new int[count];
        int indexCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                onlyEven[indexCount] = array[i];
                indexCount++;
            }
        }
        return onlyEven;
    }

    // 2 point max algorithm
    public static int max(int[] array) {
        int largest = array[0];
        for (int i : array) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    // 2 point sum algorithm
    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}