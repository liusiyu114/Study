package com.siyu.interviewquestion;

public class BinarySearch {

  public static void main(String[] args) {
    int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
    System.out.println(binSearch(srcArray, 0, srcArray.length - 1, 22));

    int[] arr = {5, 2, 8, 4, 9, 1};
    new BinarySearch().selectionSort(arr);

    int[] arr1 = {5, 2, 8, 4, 9, 1};
    new BinarySearch().insertionSort(arr1);
  }

  // 二分查找递归实现
  public static int binSearch(int srcArray[], int start, int end, int key) {
    int mid = (end - start) / 2 + start;
    if (srcArray[mid] == key) {
      return mid;
    }
    if (start >= end) {
      return -1;
    } else if (key > srcArray[mid]) {
      return binSearch(srcArray, mid + 1, end, key);
    } else if (key < srcArray[mid]) {
      return binSearch(srcArray, start, mid - 1, key);
    }
    return -1;
  }

  // 二分查找普通循环实现
  public static int binSearch(int srcArray[], int key) {
    int mid = srcArray.length / 2;
    if (key == srcArray[mid]) {
      return mid;
    }

    int start = 0;
    int end = srcArray.length - 1;
    while (start <= end) {
//          mid = (start + end) >> 1;
//            mid = (start + end) / 2;
      mid = (end - start) / 2 + start;
      if (key < srcArray[mid]) {
        end = mid - 1;
      } else if (key > srcArray[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * @param @param strs
   * @return void
   * @Title: selectionSort
   * @Description: 选择排序:算法描述：对于给定的一组记录，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换；接着对不包括第一个记录以外的其他记录进行第二轮比较，得到最小的记录并与第二个记录进行位置交换；重复该过程，直到进行比较的记录只有一个时为止。(这里用一句话描述这个方法的作用)
   * @author siyu {5,2,8,4,9,1};
   */
  public void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int x = i;
      for (int j = x + 1; j < arr.length; j++) {
        if (arr[j] < arr[x]) {
          x = j;
        }
      }

      if (x != i) {
        int tmp = arr[i];
        arr[i] = arr[x];
        arr[x] = tmp;
      }

      System.out.print("第" + i + "次排序:[");
      for (int y : arr) {
        System.out.print(y + ",");
      }
      System.out.print("]");

      System.out.println("-----------");
    }
  }

  /**
   * @param @param arr
   * @return void
   * @Title: insertionSort
   * @Description: 插入排序(这里用一句话描述这个方法的作用)
   * @ps 这个算法从数组的第二个元素开始循环，将选中的元素与之前的元素一一比较，如果选中的元素小于之前的元素，则将之前的元素后移，最后再将选中的元素放在合适的位置。在这个算法执行的过程中，总是保持着索引i之前的数组是升序排列的。
   * @author siyu {5,2,8,4,9,1};
   */
  public void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int curVal = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > curVal) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curVal;
    }
    for (int i : arr) {
      System.out.print(i + ",");
    }
  }
}