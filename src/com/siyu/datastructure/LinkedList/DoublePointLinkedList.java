package com.siyu.datastructure.LinkedList;

/**
 * @Description 双端链表 Created by siyu on 2018/12/11 10:04
 */
public class DoublePointLinkedList {

  //头节点
  private Node head;
  //尾节点
  private Node tail;
  //节点个数
  private int size;

  public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
      this.data = data;
    }
  }

  /**
   * 链表头新增节点
   */
  public void addHead(Object data) {
    Node node = new Node(data);
    if (size == 0) {
      head = node;
      tail = node;
      size++;
    } else {
      node.next = head;
      head = node;
      size++;
    }
  }

  /**
   * 链表尾新增节点
   * @param data
   */
  public void addTail(Object data) {
    Node node = new Node(data);
    if (size == 0) {
      head = node;
      tail = node;
      size++;
    } else {
      //tail.next指向当前node(给next赋值),  然后把tail的引用指向node(最后一个节点的next永远指向Null) 把所有的节点关联起来形成一个链式表.
      tail.next = node;
      tail = node;
      size++;
    }
  }

  //删除头部节点，成功返回true，失败返回false
  public boolean delHead() {
    if (size == 0) {//当前链表节点数为0
      return false;
    }
    if (head.next == null) {//当前链表节点数为1
      head = null;
      tail = null;
    } else {
      head = head.next;
    }
    size--;
    return true;
  }

  //判断是否为空
  public boolean isEmpty() {
    return (size == 0);
  }

  //获得链表的节点个数
  public int getSize() {
    return size;
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

  public static void main(String [] args){
  };
}
