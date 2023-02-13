    import java.util.ArrayList;
    /** Static methods for aiding in the creation of sorting algorithms */
    public class SortUtils
    {
        /** Checks if an array of integers is non-descending order */
        public static boolean isSorted(ArrayList<Integer> intArr)
        {
            int current;
            int next = intArr.get(0);

            for (int i = 0; i < intArr.size() - 1; i++) {
                current = next;
                next = intArr.get(i + 1);
                if (next < current) return false;
            }
            return true;
        }

        public static boolean isSortedStr(ArrayList<String> strArr)
        {
            String  current;
            String next = strArr.get(0);

            for (int i = 0; i < strArr.size() - 1; i++) {
                current = next;
                next = strArr.get(i + 1);
                if (next.compareTo(current) < 0) return false;
            }
            return true;
        }

    }