public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        while (beginning <= end) {
            int middlenumber=beginning+(end-beginning)/2;
            if (searchedValue<array[middlenumber]) {
                end = middlenumber - 1;
            } else 
            if (searchedValue>array[middlenumber]) { 
                beginning = middlenumber + 1;
            } else 
            return true;
        }
        return false;
    }
}

