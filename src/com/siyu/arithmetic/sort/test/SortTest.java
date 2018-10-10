package com.siyu.arithmetic.sort.test;

import com.siyu.arithmetic.sort.Sort;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.arithmetic.sort.test
 * @Class: SortTest
 * @Description: TODO
 * @date 2018/9/3 10:35
 */
public class SortTest {

    //选择排序
    @Test
    public void test(){
        int[] arr={5,2,8,4,9,1};
        for(int i : new Sort().selectionSort(arr)){
            System.out.print(i+",");
        };
    }
    //插入排序
    @Test
    public void test1(){
        int[] arr={5,2,8,4,9,1};
        for(int i : new Sort().insertionSort(arr)){
            System.out.print(i+",");
        };
    }
}
