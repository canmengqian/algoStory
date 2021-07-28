package org.data.struct.list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className SingleList
 * @description TODO
 * @date 2021/7/15
 */
public class SingleLinkList {
    private  Node firstNode ;
    public void addTail(int data) {
        if(firstNode == null) {
            firstNode = Node.builder().data(data).next(null).build();
        }
        else {
            Node newNode = Node.builder().data(data).next(null).build();
            Node curNode = firstNode;
            while (curNode.getNext() !=null) {
                if(curNode.getNext() == null) {
                   break;
                }
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode) ;
        }
    }

    public void print() {
        Node curNode = firstNode;
        StringBuilder rs = new StringBuilder();
        while (curNode !=null) {
            rs.append(curNode.getData()).append(",");
            curNode = curNode.getNext();
        }
        System.out.println(rs);
    }

    public static void main(String[] args) {
        SingleLinkList list = new SingleLinkList();
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.print();
    }
}
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Node {
    private  int data;
    private  Node next;
}
