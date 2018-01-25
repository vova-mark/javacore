package center.kit.app.homework.lesson12;

public class ArraySorterGenerics<T extends Number & Comparable> {
    private T[] innerArray;

    public ArraySorterGenerics(T[] array) {
        this.innerArray = array;
    }

    public T[] getInnerArray() {
        return innerArray;
    }

    public void sort() {
        for (int i = 0; i < innerArray.length; i++) {
            T max = innerArray[0];
            for (int j = 0; j < innerArray.length - 1 - i; j++) {
                if (innerArray[j].compareTo(innerArray[j + 1]) > 0) {
                    T temp = innerArray[j + 1];
                    innerArray[j + 1] = innerArray[j];
                    innerArray[j] = temp;
                }
            }
        }
    }

    public static <T extends Number & Comparable> T[] sort(T[] arrayToSort) {
        //T[] innerArray = arrayToSort;
        for (int i = 0; i < arrayToSort.length; i++) {
            T max = arrayToSort[0];
            for (int j = 0; j < arrayToSort.length - 1 - i; j++) {
                if (arrayToSort[j].compareTo(arrayToSort[j + 1]) > 0) {
                    T temp = arrayToSort[j + 1];
                    arrayToSort[j + 1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

}
