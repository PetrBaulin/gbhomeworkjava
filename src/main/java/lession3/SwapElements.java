package lession3;

public class SwapElements<T> {
    public void swap(T[] array, int first, int second) {
        T buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;
    }
}
