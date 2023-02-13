import java.util.ArrayList;

public class ArrayListAlgorithms {

    public static void quickSort(ArrayList<Comparable> sortArray) {
        quickSort(sortArray, 0, sortArray.size() - 1);
    }

    public static void quickSort(ArrayList<Comparable> sortArray, int left, int right) {
        if (left >= right) return;

        Comparable pivot = sortArray.get((left + right) / 2);
        int index = partition(sortArray, left, right, pivot);
        quickSort(sortArray, left, index - 1);
        quickSort(sortArray, index, right);
    }

    public static void quickSort(Comparable[] sortArray) {
        quickSort(sortArray, 0, sortArray.length - 1);
    }

    public static void quickSort(Comparable[] sortArray, int left, int right) {
        if (left >= right) return;

        Comparable pivot = sortArray[(left + right) / 2];
        int index = partition(sortArray, left, right, pivot);
        quickSort(sortArray, left, index - 1);
        quickSort(sortArray, index, right);
    }

    private static int partition(ArrayList<Comparable> sortArray, int left, int right, Comparable pivot) {
        while (left <= right) {
            while (sortArray.get(left).isLessThan(pivot)) {
                left++;
            }
            while (sortArray.get(right).isGreaterThan(pivot)) {
                right++;
            }

            if (left <= right) {
                swap(sortArray, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static int partition(Comparable[] sortArray, int left, int right, Comparable pivot) {
        while (left <= right) {
            while (sortArray[left].isLessThan(pivot)) {
                left++;
            }
            while (sortArray[right].isGreaterThan(pivot)) {
                right++;
            }

            if (left <= right) {
                swap(sortArray, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(ArrayList<Comparable> sortArray, int left, int right) {
        sortArray.set(left, sortArray.set(right, sortArray.get(left)));
    }
    private static void swap(Comparable[] sortArray, int left, int right) {
        Comparable temp = sortArray[left];
        sortArray[left] = sortArray[right];
        sortArray[right] = temp;
    }
}
