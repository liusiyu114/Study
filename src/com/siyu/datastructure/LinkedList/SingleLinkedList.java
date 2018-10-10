package com.siyu.datastructure.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.datastructure.LinkedList
 * @Class: SingleLinkedList
 * @Description: 单向链表
 * @date 2018/8/20 9:37
 * @theory 单链表是链表中结构最简单的。一个单链表的节点(Node)分为两个部分，第一个部分(data)保存或者显示关于节点的信息，另一个部分存储下一个节点的地址。最后一个节点存储地址的部分指向空值。
 * 　单向链表只可向一个方向遍历，一般查找一个节点的时候需要从第一个节点开始每次访问下一个节点，一直访问到需要的位置。而插入一个节点，对于单向链表，我们只提供在链表头插入，只需要将当前插入的节点设置为头节点，next指向原头节点即可。删除一个节点，我们将该节点的上一个节点的next指向该节点的下一个节点。
 * @reference https://www.cnblogs.com/ysocean/p/7928988.html
 */
public class SingleLinkedList {
    private int size;//链表节点的个数
    private Node head;//头节点

    /**
     * 链表的每个节点类
     */
    public class Node {
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接

        public Node(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    //在链表头添加元素
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }

    //在链表头删除元素
    public Object delHead() {
        Object obj = head.data;
        head = head.next;
        size--;
        return obj;
    }

    //查找指定元素，找到了返回节点Node，找不到返回null
    public Node find(Object obj) {
        Node current = head;
        int tempSize = size;
        while (tempSize > 0) {
            if (obj.equals(current.data)) {
                return current;
            } else {
                current = current.next;
            }
            tempSize--;
        }
        return null;
    }

    //删除指定的元素，删除成功返回true
    public boolean delete(Object value) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        Node previous = head;
        while (current.data != value) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if (current == head) {
            head = current.next;
            size--;
        } else {//删除的节点不是第一个节点
            previous.next = current.next;
            size--;
        }
        return true;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return (size == 0);
    }

    //显示节点信息
    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {//当前链表只有一个节点
                System.out.println("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        } else {//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }
    }
}
