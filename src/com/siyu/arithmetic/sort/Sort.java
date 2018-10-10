package com.siyu.arithmetic.sort;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.arithmetic.sort
 * @Class: SelectionSort
 * @Description: 排序算法
 * @date 2018/9/3 10:19
 */
public class Sort {


    /**
     * @param arr
     * @return
     * @description 选择排序
     * @ps 算法描述：对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换；接着对不包括第一个记录以外的其他记录进行第二轮比较，得到最小的记录并与第二个记录进行位置交换；重复该过程，直到进行比较的记录只有一个时为止。(这里用一句话描述这个方法的作用)
     */
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = i;
            for (int j = x + 1; j < arr.length; j++) {//筛选出最小值
                if (arr[j] < arr[x]) {//
                    x = j;//记录下最小值所在的位置
                }
            }

            //找出最小的值进行交换
            if (x != i) {
                int tmp = arr[x];
                arr[x] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }

    /*
     * @description 插入排序
     * @ps 这个算法从数组的第二个元素开始循环，将选中的元素与之前的元素一一比较，如果选中的元素小于之前的元素，则将之前的元素后移，最后再将选中的元素放在合适的位置。在这个算法执行的过程中，总是保持着索引i之前的数组是升序排列的。
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curVal = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curVal) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curVal;
        }
        return arr;
    }

}
