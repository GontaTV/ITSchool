package ru.academits;

import ru.academits.linkedlist.gonta.LinkedList;

public class ListMain {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.addBegin(1);
        num.addBegin(2);
        num.addBegin(3);
        num.addBegin(4);

       System.out.println(num);

        System.out.println(num.deleteByValue(8));

        num.addByIndex(5, 2);

        num.setElementByIndex(0, 2);
        System.out.println(num.setElementByIndex(33,3));
        System.out.println(num.deleteElementByIndex(4));

        num.reverseList();
        System.out.println(num);

        LinkedList<Integer> number = new LinkedList<>();

        System.out.println(num.copy(number));

    }
}
