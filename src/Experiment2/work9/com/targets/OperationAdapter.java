package Experiment2.work9.com.targets;

import Experiment2.work9.com.adaptees.BinarySearch;
import Experiment2.work9.com.adaptees.QuickSort;

/**
 * @ClassName： OperationAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 15:38
 **/
public class OperationAdapter implements DataOperation{

    private QuickSort quickSort;
    private BinarySearch search;

    public OperationAdapter() {
        quickSort = new QuickSort();
        search = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return search.binarySearch(array, key);
    }
}
