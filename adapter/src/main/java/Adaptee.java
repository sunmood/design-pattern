/**
 * Created by sunmood on 2018/12/26.
 * 适配者
 */
public class Adaptee {
    public void quickSort(int[] arr){
        System.out.println("快速排序。。。");
    }

    public void binarySearch(int[] arr, int a){
        System.out.println("二分法查找");
    }
}
