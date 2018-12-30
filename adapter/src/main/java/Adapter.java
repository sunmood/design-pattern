/**
 * Created by sunmood on 2018/12/26.
 * 适配器类
 */
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    public void sort(int[] arr) {
        adaptee.quickSort(arr);
    }

    public void search(int[] arr, int a) {
        adaptee.binarySearch(arr, a);
    }
}
