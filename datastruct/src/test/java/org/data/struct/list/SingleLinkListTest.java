package org.data.struct.list;

import junit.framework.TestCase;
import org.junit.Test;

public class SingleLinkListTest extends TestCase {

    @Test
    public void testAddHead() {
        SingleLinkList list = new SingleLinkList();
        list.addHead(1);
        list.addHead(2);
        list.addHead(3);
        list.addHead(4);
        list.print();
    }
}