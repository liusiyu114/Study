package com.siyu.interviewquestion;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.interviewquestion
 * @Class: Sort
 * @Description:  快速排序
 * 快速排序采用了分治策略。就是在一个数组中取一个基准数字，把小的数放基准的左边，大的数放基准的右边。
 * 基准左边和右边分别是新的序列。在新的序列中再取一个基准数字，小的放左边，大的放右边。
 * 这个里面用到的递归。我们需要三个参数，一个是数组，另外两个是序列的边界
 * @date 2018/8/27 12:07
 */
public class Sort {

    public static void main(String[] args) {
        int [] array = {7,3,5,1,2,8,9,2,6,8,9,4};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
    /*先按照数组为数据原型写出算法，再写出扩展性算法。数组{49,38,65,97,76,13,27}
     * */
    public static void quickSort(int[]n ,int left,int right){
        int pivot;
        if (left < right) {
            //pivot作为枢轴，较之小的元素在左，较之大的元素在右
            pivot = partition(n, left, right);
            //对左右数组递归调用快速排序，直到顺序完全正确
            quickSort(n, left, pivot - 1);
            quickSort(n, pivot + 1, right);
        }
    }

    public static int partition(int[]n ,int left,int right){
        int pivotkey = n[left];
        //枢轴选定后永远不变，最终在中间，前小后大
        while (left < right) {
            while (left < right && n[right] >= pivotkey) --right;
            //将比枢轴小的元素移到低端，此时right位相当于空，等待低位比pivotkey大的数补上
            n[left] = n[right];
            while (left < right && n[left] <= pivotkey) ++left;
            //将比枢轴大的元素移到高端，此时left位相当于空，等待高位比pivotkey小的数补上
            n[right] = n[left];
        }
        //当left == right，完成一趟快速排序，此时left位相当于空，等待pivotkey补上
        n[left] = pivotkey;
        return left;
    }
}
