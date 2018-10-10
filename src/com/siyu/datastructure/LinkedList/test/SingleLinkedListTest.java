package com.siyu.datastructure.LinkedList.test;

import com.siyu.datastructure.LinkedList.SingleLinkedList;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.datastructure.LinkedList.test
 * @Class: SingleLinkedListTest
 * @Description: TODO
 * @date 2018/8/20 10:18
 */
public class SingleLinkedListTest {

    @Test
    public void test(){
        SingleLinkedList sll = new SingleLinkedList();
        sll.addHead("A");
        sll.addHead("B");
        sll.addHead("C");
        sll.addHead("D");
        sll.addHead("E");
        sll.addHead("F");

        sll.display();

        sll.delHead();
        sll.display();

        sll.delete("B");
        sll.display();

        System.out.println(sll.find("E").toString());
    }

    @Test
    public void goOrNotGo(){

    }
}
