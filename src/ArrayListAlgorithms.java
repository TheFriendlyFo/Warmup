import java.util.ArrayList;

public class ArrayListAlgorithms {

    public static <Compare extends Comparable> void quickSort(ArrayList<Compare> sortArray) {
        quickSort(sortArray, 0, sortArray.size() - 1);
    }

    public static <Compare extends Comparable> void quickSort(ArrayList<Compare> sortArray, int left, int right) {
        if (left >= right) return;

        Comparable pivot = sortArray.get((left + right) / 2);
        int index = partition(sortArray, left, right, pivot);
        quickSort(sortArray, left, index - 1);
        quickSort(sortArray, index, right);
    }

    private static <Compare extends Comparable> int partition(ArrayList<Compare> sortArray, int left, int right, Comparable pivot) {
        while (left <= right) {
            while (sortArray.get(left).compareTo(pivot) < 0) {
                left++;
            }
            while (sortArray.get(right).compareTo(pivot) > 0) {
                right--;
            }

            if (left <= right) {
                swap(sortArray, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static <Compare extends Comparable> void swap(ArrayList<Compare> sortArray, int left, int right) {
        sortArray.set(left, sortArray.set(right, sortArray.get(left)));
    }
}
