package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
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

    @Test
    public void given3NumberWhenAppendedLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        boolean result = myLinkdList.head.equals(myFirstNode) &&
                myLinkdList.head.getNext().equals(mySecondNode) &&
                myLinkdList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.insert(myFirstNode,mySecondNode);
        myLinkdList.printMyNodes();
        boolean result = myLinkdList.head.equals(myFirstNode) &&
                myLinkdList.head.getNext().equals(mySecondNode) &&
                myLinkdList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenDeleteFirstElementShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        INode result = myLinkdList.pop();
        myLinkdList.printMyNodes();
        Assert.assertEquals(myFirstNode,result);
    }
    @Test
    public void given3NumberWhenDeleteLastElementShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        INode result = myLinkdList.popLast();
        myLinkdList.printMyNodes();
        Assert.assertEquals(myThirdNode,result);
    }
    @Test
    public void given3NumberWhenSearchElementShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkdList = new MyLinkedList();
        myLinkdList.append(myFirstNode);
        myLinkdList.append(mySecondNode);
        myLinkdList.append(myThirdNode);
        myLinkdList.printMyNodes();
        INode result = myLinkdList.search(mySecondNode);
        Assert.assertEquals(mySecondNode,result);
    }
}