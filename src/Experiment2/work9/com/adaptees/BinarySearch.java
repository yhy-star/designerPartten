package Experiment2.work9.com.adaptees;

/**
 * @ClassName： BinarySearch
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 15:37
 **/
public class BinarySearch {
    public int binarySearch(int array[],int key) {
        int low = 0;
        int high = array.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if(midVal < key) {
                low = mid +1;
            }
            else if (midVal > key) {
                high = mid -1;
            }
            else {
                return 1; //找到元素返回1
            }
        }
        return -1;  //未找到元素返回-1
    }
}
