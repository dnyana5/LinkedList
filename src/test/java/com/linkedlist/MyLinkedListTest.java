package com.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberWhenLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.add(myFirstNode);
        myLinkdList.add(mySecondNode);
        myLinkdList.add(myThirdNode);
        myLinkdList.printMyNodes();
        boolean result = myLinkdList.head.equals(myThirdNode) &&
                myLinkdList.head.getNext().equals(mySecondNode) &&
                myLinkdList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

}
