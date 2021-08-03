package org.data.struct.list;

import junit.framework.TestCase;
import org.junit.Test;

public class DoubleLinkListTest extends TestCase {

    /**
     * 测试头插法
     */
    @Test
    public void testAddHead() {
        DoubleLinkList list = new DoubleLinkList();
        for(int i=0;i<10;i++) {
            list.addHead(i);
        }
        list.print();
    }

    /**
     * 测试 尾插法
     */
    @Test
    public void testAddTail() {
        DoubleLinkList list = new DoubleLinkList();
        for(int i=0;i<10;i++) {
            list.addTail(i);
        }
        list.print();
    }
}