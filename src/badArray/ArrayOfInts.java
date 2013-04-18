package badArray;

public class ArrayOfInts {
    int[] arr;
    int cursor;
    /*
     * Constructor that creates an array buffer with 
     * the specified amount of available space. The 
     * array is initially empty. Values can be added 
     * to the array, up to the available capacity.
     * @param   size    Capacity of the array desired.
     */
    public ArrayOfInts(int size) {
        arr = new int[size];
        cursor = 0;
        for (int i = 0; i < size; ++i)
            arr[i] = 0;
    }
    /*
     * Sets the cursor position to the beginning of the array.
     */
    public void reset() {
        cursor = 1;
    }
    /*
     * Determines if the cursor is not beyond the end of the array.
     * @return      True if there is an array element at the cursor,
     * false if the cursor is beyond the end of the array.
     */
    public boolean hasNext() {
        return (cursor < arr.length);
    }
    /*
     * Returns the next element
     */
    public int next() {
        if (cursor < arr.length) {
            ++cursor;
            return arr[cursor];
        } else
            return 0;
    }
    /*
     * Adds an integer value to the array.
     * @param   value   The integer value to be 
     * added to the list.
     * @return      True if the passed value was added, 
     * false if it was not added 
     */
    public boolean add(int value) {
        if (cursor < arr.length) {
            arr[cursor] = value;
            ++cursor;
            return true;
        } else
            return false;
    }
    /*
     * Adds up the sum of all of the values in the array.
     * @return      The sum of all values in the array.
     */
    public int sum() {
        int sumVal = 0;
        for (int i = 1; i < arr.length; ++i)
            sumVal += arr[i];
        return sumVal;
    }
    /*
     * Determines the maximum value in the array,
     * assuming that the array has at least one element.
     * @return      The highest value in he array.
     */
    public int max() {
        int i;
        int maxVal = arr[0];
        for (i = 1; i < arr.length; ++i)
            if (maxVal < arr[i])
                maxVal = arr[i];
        return i;
    }
}

