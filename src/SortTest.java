public class SortTest {
    public static void main(String[] args) {
        testQuickSort();
    }
    /**
     * 快速排序
     */
    private static void testQuickSort() {
        int[] array = {5, 9, 1, 9, 5, 3, 7, 6, 1};
        Quick_Sort quickSort = new Quick_Sort(array);
        quickSort.sort();
        quickSort.print();
    }
}