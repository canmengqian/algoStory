package org.data.struct.list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className DoubleList
 * @description 双链表
 * @date 2021/7/15
 */
public class DoubleLinkList {
    /**
     * 头节点
     */
    private Node head;

    /**
     * 头部添加
     */
    public void  addHead(int data) {
        Node node = Node.builder().pre(null).data(data).next(null).build();
        if(head == null) {
            head = node;
        }
        else{
            node.setNext(head);
            head.setPre(node);
            head = node;
        }
    }

    /**
     * 尾部添加
     * @param data
     */
    public void addTail(int data) {
        Node node = Node.builder().pre(null).data(data).next(null).build();
        if(head == null) {
            head = node;
        }
        else {
            Node curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            node.setPre(curNode);
            curNode.setNext(node);
        }
    }

    public void  print() {
        while (head != null) {
            System.out.print(head.data+"\t");
            head = head.next;
        }
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
  static   class Node {
        private int data;
        private Node pre;
        private Node next;
    }
}
