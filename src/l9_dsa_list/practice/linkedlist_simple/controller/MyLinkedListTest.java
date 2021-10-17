package l9_dsa_list.practice.linkedlist_simple.controller;

import l9_dsa_list.practice.linkedlist_simple.model.MyLinkedList;

import javax.xml.soap.Node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4,9);
//        linkedList.printList();
    }
}
