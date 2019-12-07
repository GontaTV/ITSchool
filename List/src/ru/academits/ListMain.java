package ru.academits;

import ru.academits.linkedlist.gonta.LinkedList;

public class ListMain {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        System.out.println(num.delByValue(8));

        num.addByIndex(5, 4);

        num.print();
        num.setElementByIndex(0, 2);
        num.print();
        System.out.println();
        System.out.println(num.setElementByIndex(33, 3));
        num.print();
        System.out.println();
        System.out.println(num.delElementByIndex(2));
        num.print();
        System.out.println();

        num.reverseList();
        num.print();
        System.out.println();

        LinkedList<Integer> number = new LinkedList<>();
        num.copy(number);
        number.print();

    }
}
